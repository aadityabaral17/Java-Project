module com.example.javaproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.javaproject to javafx.fxml;
    exports com.example.javaproject;
}