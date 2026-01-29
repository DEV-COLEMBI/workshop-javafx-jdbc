module co.com.colembi.workshopjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.com.colembi.workshopjavafx to javafx.fxml;
    exports co.com.colembi.workshopjavafx;
}