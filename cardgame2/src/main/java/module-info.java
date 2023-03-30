module com.example.cardgame {
  requires javafx.graphics;
  requires javafx.controls;
  requires javafx.fxml;


  opens no.ntnu.idata2001.cardgame to javafx.fxml;
  exports no.ntnu.idata2001.cardgame;
}