package nyc.c4q.android.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {

  private EditText emailField;
  private EditText passwordField;
  private Button loginButton;
  private final AuthenticationManager manager;

  public LoginActivity() {
    // #25 TODO - fix this
    manager = null;
  }

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    // #26 TODO - load view hierarchy in R.layout.activity_login

    // #27 TODO - get references to views, and other setup

    // #28 TODO - call checkCredentials via OnClickListener
  }

  private void checkCredentials(String email, String password) {
    if(manager.validateLogin(email, password)) {
      // #29 TODO - go to EmailListActivity
    }
    else {
      // #30 TODO launch alert dialog on failed login
      // check strings.xml for dialog
    }
  }
}
