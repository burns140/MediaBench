package com.example.mediabench.ui.login;

import androidx.annotation.Nullable;


/**
 * Data validation state of the login form
 */
public class LoginFormState {

    @Nullable
    private Integer usernameError;

    @Nullable
    private Integer passwordError;

    private boolean validData;

    LoginFormState(@Nullable Integer usernameError, @Nullable Integer passwordError) {
        this.usernameError = usernameError;
        this.passwordError = passwordError;
        this.validData = false;
    }

    LoginFormState(boolean validData) {
        this.usernameError = null;
        this.passwordError = null;
        this.validData = validData;
    }

    @Nullable
    public Integer getUsernameError() {
        return usernameError;
    }

    public void setUsernameError(@Nullable Integer usernameError) {
        this.usernameError = usernameError;
    }

    @Nullable
    public Integer getPasswordError() {
        return passwordError;
    }
}
