/*
 * Copyright 2013-2017 QAPROSOFT (http://qaprosoft.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qaprosoft.carina.core.demo.gui.gsmarena.pages.mailru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class LoginPage extends AbstractPage {
    @FindBy(name = "Username")
    private ExtendedWebElement emailTextField;

    @FindBy(name = "Password")
    private ExtendedWebElement passwordTextField;

    @FindBy(xpath = "//button/span[text()='Войти']")
    private ExtendedWebElement signInButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://account.mail.ru/login");
    }

    public void signIn(String email, String password) {
        emailTextField.type(email);
        passwordTextField.type(password);
        signInButton.click();
    }
}