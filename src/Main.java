import controller.BookingController;
import controller.EventController;
import controller.PaymentController;
import model.BookingFacade;
import model.BookingManager;
import model.Event;
import model.EventFactory;
import model.EventManager;
import model.EventType;
import model.User;
import notification.EmailNotification;
import notification.NotificationAdapter;
import payment.CardPayment;
import payment.PayPalPayment;
import view.BookingView;
import view.EventView;
import view.PaymentView;

public class Main {
    public static void main(String[] args) {
        // Создаем менеджеры и представления
        EventManager eventManager = EventManager.getInstance();
        EventView eventView = new EventView();
        EventController eventController = new EventController(eventManager, eventView);

        // Создание мероприятий через фабрику
        Event concert = EventFactory.createEvent(EventType.CONCERT, "Rock Concert", "Live rock music concert.");
        Event conference = EventFactory.createEvent(EventType.CONFERENCE, "Tech Conference", "Annual technology conference.");

        // Добавление мероприятий
        eventController.addEvent(concert);
        eventController.addEvent(conference);

        // Отображение всех мероприятий
        eventController.showAllEvents();

        // Создаем пользователя для бронирования
        User user = new User("Alice");

        // Создаем менеджер бронирований и представление для бронирования
        BookingManager bookingManager = BookingManager.getInstance();
        BookingView bookingView = new BookingView();

        // Создаем адаптер для уведомлений (через email)
        NotificationAdapter notificationAdapter = new NotificationAdapter(new EmailNotification());

        // Создаем фасад для управления бронированием и уведомлениями
        BookingFacade bookingFacade = new BookingFacade(bookingManager, notificationAdapter, bookingView);

        // Создаем контроллер бронирования и проводим бронирование для концерта
        BookingController bookingController = new BookingController(bookingFacade);
        bookingController.createBooking(concert, user);

        // Оплата бронирования через PayPal
        PaymentView paymentView = new PaymentView();
        PaymentController paymentController = new PaymentController(paymentView);
        paymentController.processPayment(new PayPalPayment(), 150.00);

        // Добавим еще одно бронирование для конференции
        bookingController.createBooking(conference, user);

        // Оплата бронирования конференции с помощью карты
        paymentController.processPayment(new CardPayment(), 200.00);
    }
}
