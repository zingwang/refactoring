package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces;

public class AlertlNotificationService implements NotificationService {
private  AlertService alertService;


    @Override
    public void sendNotification(Notification notification) {
        AlertMessage alertMessage = new AlertMessage();
        alertMessage.setMessage(notification.getTitle() + " is shipped");
        alertMessage.setFor(notification.getReceiver());
        alertService.add(alertMessage);
    }
}
