module com.knowledgebase.knowledgebase {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.knowledgebase.knowledgebase to javafx.fxml;
    exports com.knowledgebase.knowledgebase;
    exports com.knowledgebase.knowledgebase.controllers;
    opens com.knowledgebase.knowledgebase.controllers to javafx.fxml;
}