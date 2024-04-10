package org.ibs.steps;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.h2.command.query.Select;
import org.ibs.page.GoodsPage;
import org.ibs.page.MainPage;
import org.ibs.runner.TestRunner;
import org.ibs.tests.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class StepAddGoods  {
    public static WebDriver driver;
    @Дано("открыт стенд")
    public void openStand() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://localhost:8080");

    }
    @Когда("Пользователь нажимает на выпадающий список Песочница")
    public void clickSandboxButton() {
        WebElement sandboxButton = driver.findElement(By.xpath("//a [@id='navbarDropdown']"));
       sandboxButton.click();
    }
    @И("Пользователь выбирает в выпадающем списке пункт Товары")
    public void clickGoodsButton() {
        WebElement goodsButton = driver.findElement(By.xpath("//a [@href='/food']"));
        goodsButton.click();
    }
    @И("Пользователь нажимает на кнопку Добавить")
    public void clickAddButton() {
        WebElement addButton = driver.findElement(By.xpath("//button[text()='Добавить']"));
        addButton.click();
    }
    @И("Пользователь вводит наименование экзотического фрукта")
    public void NameGoodExoticFruit() {
        WebElement nameGood = driver.findElement(By.xpath("//input[@id='name']"));
        nameGood.sendKeys("Папайя");
    }
    @И("Пользователь вводит наименование экзотического овоща")
    public void NameGoodExoticVegetable() {
        WebElement nameGood = driver.findElement(By.xpath("//input[@id='name']"));
        nameGood.sendKeys("Кивано");
    }
    @И("Пользователь вводит наименование фрукта")
    public void NameGoodNotExoticFruit() {
        WebElement nameGood = driver.findElement(By.xpath("//input[@id='name']"));
        nameGood.sendKeys("Банан");
    }
    @И("Пользователь вводит наименование овоща")
    public void NameGoodNotExoticVegetable() {
        WebElement nameGood = driver.findElement(By.xpath("//input[@id='name']"));
        nameGood.sendKeys("Огурец");
    }
    @И("Пользователь нажимает на тип и выбирает в выпадающем списке тип Фрукт")
    public void clickDropdownTypeFruit() {
        WebElement goodType = driver.findElement(By.id("type"));
        goodType.click();
        WebElement typeFruit = driver.findElement(By.xpath("//option[@value='FRUIT']"));
        typeFruit.click();
    }
    @И("Пользователь нажимает на тип и выбирает в выпадающем списке тип Овош")
    public void clickDropdownTypeVegetable() {
        WebElement goodType = driver.findElement(By.id("type"));
        goodType.click();
        WebElement typeFruit = driver.findElement(By.xpath("//option[@value='VEGETABLE']"));
        typeFruit.click();
    }

    @И("Пользователь выбирает чек-бокс Экзотический")
    public void clickCheckboxExotic() {
        WebElement checkBoxExotic = driver.findElement(By.id("exotic"));
        checkBoxExotic.click();
    }

    @И("Пользователь нажимает кнопку Сохранить")
    public void clickSaveButton() {
        WebElement saveButton = driver.findElement(By.id("save"));
        saveButton.click();

    }
    @Тогда("Проверяем, что в последней строке таблицы Товары отображаются введенные данные экзотического фрукта")
    public void assertResultExoticFruit() {


        List<String> listExoticFruit = Arrays.asList(
                "5", "Папайя", "Фрукт", "true");


        List<WebElement> lastRowInTableOfGoods = driver.findElements(By.xpath(
                "//tr[5]/*"));

        List<String> lastRowInTableOfGoodsStr = new ArrayList<>();

        for (WebElement element : lastRowInTableOfGoods) {
            lastRowInTableOfGoodsStr.add(element.getText());
        }

        Assertions.assertEquals(
                listExoticFruit,
                lastRowInTableOfGoodsStr,
                "Не совпадают элементы в таблице товаров");
    }

    @Тогда("Проверяем, что в последней строке таблицы Товары отображаются введенные данные фрукта")
    public void assertResultNotExoticFruit() {


        List<String> listExoticFruit = Arrays.asList(
                "5", "Банан", "Фрукт", "false");


        List<WebElement> lastRowInTableOfGoods = driver.findElements(By.xpath(
                "//tr[5]/*"));

        List<String> lastRowInTableOfGoodsStr = new ArrayList<>();

        for (WebElement element : lastRowInTableOfGoods) {
            lastRowInTableOfGoodsStr.add(element.getText());
        }

        Assertions.assertEquals(
                listExoticFruit,
                lastRowInTableOfGoodsStr,
                "Не совпадают элементы в таблице товаров");
    }
    @Тогда("Проверяем, что в последней строке таблицы Товары отображаются введенные данные экзотического овоща")
    public void assertResultExoticVegetable() {


        List<String> listExoticFruit = Arrays.asList(
                "5", "Кивано", "Овощ", "true");


        List<WebElement> lastRowInTableOfGoods = driver.findElements(By.xpath(
                "//tr[5]/*"));

        List<String> lastRowInTableOfGoodsStr = new ArrayList<>();

        for (WebElement element : lastRowInTableOfGoods) {
            lastRowInTableOfGoodsStr.add(element.getText());
        }

        Assertions.assertEquals(
                listExoticFruit,
                lastRowInTableOfGoodsStr,
                "Не совпадают элементы в таблице товаров");
    }
    @Тогда("Проверяем, что в последней строке таблицы Товары отображаются введенные данные овоща")
    public void assertResultFruit() {


        List<String> listExoticFruit = Arrays.asList(
                "5", "Огурец", "Овощ", "false");


        List<WebElement> lastRowInTableOfGoods = driver.findElements(By.xpath(
                "//tr[5]/*"));

        List<String> lastRowInTableOfGoodsStr = new ArrayList<>();

        for (WebElement element : lastRowInTableOfGoods) {
            lastRowInTableOfGoodsStr.add(element.getText());
        }

        Assertions.assertEquals(
                listExoticFruit,
                lastRowInTableOfGoodsStr,
                "Не совпадают элементы в таблице товаров");
    }
    @И("Пользователь выбирает в выпадающем списке пункт Сброс данных")
    public void clickDeleteData() {
      WebElement deleteDataButton = driver.findElement(By.xpath("//a [@id='reset']"));
      deleteDataButton.click();
    }
    @Тогда ("Закрываем соединение")
    public void finish() {
        driver.close();
        driver.quit();
    }

}
