package config;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.events.WebDriverListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Set;


public class WDListener implements WebDriverListener {

    Logger logger = LoggerFactory.getLogger(WDListener.class);

    @Override
    public void onError(Object target, Method method, Object[] args, InvocationTargetException e) {
        logger.info("exception: " + e.getMessage());
        WebDriverListener.super.onError(target, method, args, e);
    }

    @Override
    public void beforeGetCurrentUrl(WebDriver driver) {
        WebDriverListener.super.beforeGetCurrentUrl(driver);
    }

    @Override
    public void beforeGetTitle(WebDriver driver) {
        WebDriverListener.super.beforeGetTitle(driver);
    }

    @Override
    public void beforeFindElement(WebDriver driver, By locator) {
        WebDriverListener.super.beforeFindElement(driver, locator);
    }

    @Override
    public void afterFindElement(WebDriver driver, By locator, WebElement result) {
        WebDriverListener.super.afterFindElement(driver, locator, result);
    }

    @Override
    public void beforeFindElements(WebDriver driver, By locator) {
        logger.info("listener -> search element: " + locator.toString());
        WebDriverListener.super.beforeFindElements(driver, locator);
    }

    @Override
    public void afterFindElements(WebDriver driver, By locator, List<WebElement> result) {
        WebDriverListener.super.afterFindElements(driver, locator, result);
    }

    @Override
    public void beforeGetWindowHandles(WebDriver driver) {
        WebDriverListener.super.beforeGetWindowHandles(driver);
    }

    @Override
    public void afterGetWindowHandles(WebDriver driver, Set<String> result) {
        WebDriverListener.super.afterGetWindowHandles(driver, result);
    }

    @Override
    public void beforeGetWindowHandle(WebDriver driver) {
        WebDriverListener.super.beforeGetWindowHandle(driver);
    }

    @Override
    public void afterGetWindowHandle(WebDriver driver, String result) {
        WebDriverListener.super.afterGetWindowHandle(driver, result);
    }

    @Override
    public void beforeExecuteScript(WebDriver driver, String script, Object[] args) {
        WebDriverListener.super.beforeExecuteScript(driver, script, args);
    }

    @Override
    public void afterExecuteScript(WebDriver driver, String script, Object[] args, Object result) {
        WebDriverListener.super.afterExecuteScript(driver, script, args, result);
    }

    @Override
    public void beforePerform(WebDriver driver, Collection<Sequence> actions) {
        WebDriverListener.super.beforePerform(driver, actions);
    }

    @Override
    public void afterPerform(WebDriver driver, Collection<Sequence> actions) {
        WebDriverListener.super.afterPerform(driver, actions);
    }

    @Override
    public void beforeClick(WebElement element) {
        WebDriverListener.super.beforeClick(element);
    }

    @Override
    public void afterClick(WebElement element) {
        WebDriverListener.super.afterClick(element);
    }

    @Override
    public void beforeSubmit(WebElement element) {
        WebDriverListener.super.beforeSubmit(element);
    }

    @Override
    public void afterSubmit(WebElement element) {
        WebDriverListener.super.afterSubmit(element);
    }

    @Override
    public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
        WebDriverListener.super.beforeSendKeys(element, keysToSend);
    }

    @Override
    public void afterSendKeys(WebElement element, CharSequence... keysToSend) {
        WebDriverListener.super.afterSendKeys(element, keysToSend);
    }

    @Override
    public void beforeClear(WebElement element) {
        WebDriverListener.super.beforeClear(element);
    }

    @Override
    public void afterClear(WebElement element) {
        WebDriverListener.super.afterClear(element);
    }

    @Override
    public void beforeGetTagName(WebElement element) {
        WebDriverListener.super.beforeGetTagName(element);
    }

    @Override
    public void afterGetTagName(WebElement element, String result) {
        WebDriverListener.super.afterGetTagName(element, result);
    }

    @Override
    public void beforeGetAttribute(WebElement element, String name) {
        WebDriverListener.super.beforeGetAttribute(element, name);
    }

    @Override
    public void afterGetAttribute(WebElement element, String name, String result) {
        WebDriverListener.super.afterGetAttribute(element, name, result);
    }

    @Override
    public void beforeIsSelected(WebElement element) {
        WebDriverListener.super.beforeIsSelected(element);
    }

    @Override
    public void afterIsSelected(WebElement element, boolean result) {
        WebDriverListener.super.afterIsSelected(element, result);
    }

    @Override
    public void beforeIsEnabled(WebElement element) {
        WebDriverListener.super.beforeIsEnabled(element);
    }

    @Override
    public void afterIsEnabled(WebElement element, boolean result) {
        WebDriverListener.super.afterIsEnabled(element, result);
    }

    @Override
    public void beforeGetText(WebElement element) {
        WebDriverListener.super.beforeGetText(element);
    }

    @Override
    public void afterGetText(WebElement element, String result) {
        WebDriverListener.super.afterGetText(element, result);
    }

    @Override
    public void beforeFindElement(WebElement element, By locator) {
        WebDriverListener.super.beforeFindElement(element, locator);
    }

    @Override
    public void afterFindElement(WebElement element, By locator, WebElement result) {
        WebDriverListener.super.afterFindElement(element, locator, result);
    }

    @Override
    public void beforeFindElements(WebElement element, By locator) {
        WebDriverListener.super.beforeFindElements(element, locator);
    }

    @Override
    public void afterFindElements(WebElement element, By locator, List<WebElement> result) {
        WebDriverListener.super.afterFindElements(element, locator, result);
    }

    @Override
    public void beforeIsDisplayed(WebElement element) {
        WebDriverListener.super.beforeIsDisplayed(element);
    }

    @Override
    public void afterIsDisplayed(WebElement element, boolean result) {
        WebDriverListener.super.afterIsDisplayed(element, result);
    }

    @Override
    public void beforeGetLocation(WebElement element) {
        WebDriverListener.super.beforeGetLocation(element);
    }

    @Override
    public void afterGetLocation(WebElement element, Point result) {
        WebDriverListener.super.afterGetLocation(element, result);
    }

    @Override
    public void beforeGetSize(WebElement element) {
        WebDriverListener.super.beforeGetSize(element);
    }

    @Override
    public void afterGetSize(WebElement element, Dimension result) {
        WebDriverListener.super.afterGetSize(element, result);
    }

    @Override
    public void beforeGetCssValue(WebElement element, String propertyName) {
        WebDriverListener.super.beforeGetCssValue(element, propertyName);
    }

    @Override
    public void afterGetCssValue(WebElement element, String propertyName, String result) {
        WebDriverListener.super.afterGetCssValue(element, propertyName, result);
    }

    @Override
    public void beforeTo(WebDriver.Navigation navigation, String url) {
        WebDriverListener.super.beforeTo(navigation, url);
    }

    @Override
    public void afterTo(WebDriver.Navigation navigation, String url) {
        WebDriverListener.super.afterTo(navigation, url);
    }

    @Override
    public void beforeAnyAlertCall(Alert alert, Method method, Object[] args) {
        WebDriverListener.super.beforeAnyAlertCall(alert, method, args);
    }

    @Override
    public void afterAnyAlertCall(Alert alert, Method method, Object[] args, Object result) {
        WebDriverListener.super.afterAnyAlertCall(alert, method, args, result);
    }

    @Override
    public void beforeAnyTimeoutsCall(WebDriver.Timeouts timeouts, Method method, Object[] args) {
        WebDriverListener.super.beforeAnyTimeoutsCall(timeouts, method, args);
    }

    @Override
    public void afterAnyTimeoutsCall(WebDriver.Timeouts timeouts, Method method, Object[] args, Object result) {
        WebDriverListener.super.afterAnyTimeoutsCall(timeouts, method, args, result);
    }
}
