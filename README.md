# Project in Allure TestOps with manual & automated tests
<a target="_blank" href="https://allure.autotests.cloud/project/%s">allure.autotests.cloud/project/%s</a> (ask admin@qa.guru for access)

# Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/%s">jenkins.autotests.cloud/job/%s</a>

# Автотесты для [**образовательной платформы Stepik**](https://stepik.org/)

## Используемые технологии и инструменты

<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Intelij_IDEA.svg" width="40" height="40"  alt="IDEA"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Java.svg" width="40" height="40"  alt="Java"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Selenide.svg" width="40" height="40"  alt="Seleide"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Selenoid.svg" width="40" height="40"  alt="Selenoid"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Gradle.svg" width="40" height="40"  alt="Gradle"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/JUnit5.svg" width="40" height="40"  alt="JUnit 5"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Allure_Report.svg" width="40" height="40"  alt="Allure SE"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Allure_EE.svg" width="40" height="40"  alt="Allure EE"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Github.svg" width="40" height="40"  alt="Github"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Jenkins.svg" width="40" height="40"  alt="Jenkins"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Telegram.svg" width="40" height="40"  alt="Telegram"/>
</a>

IntelliJ IDEA, Java, Selenide, Selenoid, Gradle, JUnit5, Allure SE, Allure TestOps, Github, Jenkins, Telegram (reports)

## Реализованы проверки:
### UI
- [X] - Сайт имеет титл: "Catalog — Stepik"
- [X] - Консоль лог не содержит ошибок уровня SEVERE
- [X] - Смена языков интерфейса платформы и проверка на интернационализацию проекта
- [X] - Поиск курсов Java без фильтра, по вводу в поисковую строку
- [X] - Поиск курсов Java с фильтрами ( english language, with cert and Free)
- [X] - Авторизация пользователем
- [X] - Регистрация пользователя
- [X] - Logout с ЛК

    
* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```


###### For further development there are some example tests in src/test/java/cloud.autotests/tests/demowebshop
* remove @Disabled("...") annotation to run tests
```bash
gradle clean demowebshop
```

### Видео прохождения тестов, взятое из среды выполнения (из [**Selenoid**](https://selenoid.autotests.cloud/#/))
![Selenoid](src/test/resources/files/test.gif)

### Запуск в [**Jenkins**](https://jenkins.autotests.cloud/job/M2%20Tests/build?delay=0sec)
Удобный и имеющий широкое комьюнити иснтрумент, просто для освоения в виду большого количества учебного материала также удобная настройка pipelines
Статистика по запускам
![Jenkins](src/test/resources/files/Jenkins1.bmp
)
Указание параметров для запуска
![Jenkins](src/test/resources/files/Jenkins2.bmp)

### Отчёт в Allure Report
Инструмент, не нуждающийся в представлении и мгновенно завоеваший популярность против автоматически генерирующихся отчетов с тестовых фреймворков Junit4,5 и TestNG
![Allure](src/test/resources/files/AllureReport.bmp)

### Интеграция с TMS TestOps Allure
Удобная интеграция с Test Management System  Allure TestOps (ранее Allure EE), где есть возможность
хранить автотестовые прогоны с автоматическим заведением новых тест-кейсов из автоматизированных, так и создавать тест-кейсы вручную
(такие тест-кейсы также могут быть автоматизированы и при прогоне уже отображаться как авто-тесты, это делается через простой плагин и внесение @Id для автотестов)
- Автоматическая [**загрузка**](https://allure.autotests.cloud/project/279/launches) результата прогона тестов с Jenkins
  ![TestOps Allure](src/test/resources/files/testOps2.bmp)
- [**Визуализация**](https://allure.autotests.cloud/launch/5368) итогов пройденных тестов в Allure TestOps
  ![TestOps Allure](src/test/resources/files/testOps1.bmp)
- Автоматически [**загруженные**](https://allure.autotests.cloud/project/279/test-cases?treeId=0) тест-кейсы
  ![TestOps Allure](src/test/resources/files/testOps3.bmp)
### Уведомления в Telegram
Канал "Результаты автотестов для "M2"" [**для уведомлений**](https://t.me/m2m2m2m2m2m2m2m2m2m2m2m2m22m2)
![Telegram](src/test/resources/files/Telegram.bmp)
