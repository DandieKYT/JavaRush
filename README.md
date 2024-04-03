# UI, API и Mobile автотесты для сайта [Java-Rush](https://javarush.com/) — практический онлайн-курс по обучению Java.
![image](https://github.com/DandieKYT/JavaRush/assets/75677738/cd08eb3b-22da-4c6e-819b-f9fc04ed6361)



# <a name="TableOfContents">Содержание страницы</a>
+ [:trophy: Инструменты и технологии](#MyToolsAndTechnologies)
+ [Описаниe](#Description)
+ [Проект](#Project)
+ [:heavy_check_mark:  Реализованные проверки:](#ImplementedСhecks)  
  - <a href="#cases-ui"> UI
  - <a href="#cases-api"> API
  - <a href="#cases-mobile"> Mobile
+ [👷‍♂️ Сборка в Jenkins](#buildInJenkins)
    + [Страница сборки job в Jenkins](#buildInJenkins1)
    + [Главный экран со списком job в Jenkins](#buildInJenkins2)
+ [🖥 Параметры сборки в Jenkins](#terminal)
+ [:computer: Запуск из терминала](#Launch_from_terminal)
  - <a href="#console-ui"> UI
  - <a href="#console-api"> API
  - <a href="#console-mobile"> Mobile
+ [:chart_with_downwards_trend: Allure Report](#Allure_report)
    + [Главный экран отчета в Allure Report](#Allure_report1)
    + [Страница с проведенными тестами в Allure Report](#Allure_report2)
+ [:bar_chart: Интеграция с Allure TestOps](#Integration_Allure_TestOps)
    + [Экран с результатами запуска тестов](#Integration_Allure_TestOps1)
    + [Страница с тестами в TestOps](#Integration_Allure_TestOps2)
    + [Страница с тестами из Launches в Allure TestOps](#Integration_Allure_TestOps3)
+ [:bar_chart: Примеры сборок в Browserstack](#Integration_Brawserstack)
  + [Экран с результатами запуска тестов](#Integration_Brawserstack)
+ [:iphone: Отчет в Telegram](#Telegram)
+ [:movie_camera: Видео примеры прохождения тестов](#Video)
    + [Пример запуска тестов через selenoid](#Video1)
    + [Пример запуска тестов через Browserstack](#Video2)

<h2> :trophy:  Мои инструменты и технологии:</h2>

<code><a href = "https://www.java.com/ru/">![This is an image](/design/icons/Java.png)</a></code>
<code><a href = "https://gradle.org/">![This is an image](/design/icons/gradle.png)</a></code>
<code><a href = "https://www.jetbrains.com/ru-ru/idea/">![This is an image](/design/icons/Intelij_IDEA.png)</a></code>
<code><a href = "https://ru.selenide.org/">![This is an image](/design/icons/Selenide.png)</a></code>
<code><a href = "https://selenoid.autotests.cloud/#/">![This is an image](/design/icons/Selenoid.png)</a></code>
<code><a href = "https://junit.org/junit5/">![This is an image](/design/icons/JUnit5.png)</a></code>
<code><a href = "https://www.jenkins.io/">![This is an image](/design/icons/Jenkins.png)</a></code>
<code><a href = "https://github.com/allure-framework">![This is an image](/design/icons/Allure_Report.png)</a></code>
<code><a href = "https://qameta.io/">![This is an image](/design/icons/AllureTestOps.png)</a></code>
<code><a href = "https://web.telegram.org/k/">![This is an image](/design/icons/Telegram.png)</a></code>
<code><a href = "https://www.atlassian.com/ru/software/jira">![This is an image](/design/icons/Jira.png)</a></code>
<code><a href = "https://www.postman.com/">![This is an image](/design/icons/postman.png)</a></code>
<code><a href = "https://git-scm.com/">![This is an image](/design/icons/git.png)</a></code>
<code><a href = "https://github.com/">![This is an image](/design/icons/GitHub.png)</a></code>
<code><a href = "https://developer.chrome.com/docs/devtools/">![This is an image](/design/icons/devtools.png)</a></code>


<code><a href = "https://notepad-plus-plus.org/">![This is an image](/design/icons/notepad.png)</a></code>
<code><a href = "https://www.mysql.com/">![This is an image](/design/icons/sql.png)</a></code>
<code><a href = "https://ru.wikipedia.org/wiki/HTML">![This is an image](/design/icons/html.png)</a></code>
<code><a href = "https://ru.wikipedia.org/wiki/CSS">![This is an image](/design/icons/css.png)</a></code>
<code><a href = "https://www.browserstack.com/">![This is an image](/design/icons/browserstack.png)</a></code>
<code><a href = "https://appium.io/docs/en/2.0/">![This is an image](/design/icons/appium.png)</a></code>
<code><a href = "https://developer.android.com/studio">![This is an image](/design/icons/androidstudio.png)</a></code>
<code><a href = "https://rest-assured.io//">![This is an image](/design/icons/Rest-Assured.png)</a></code>
</br>
<a name="Description"><h2>Описаниe</h2></a>
Автотесты в этом проекте написаны на `Java` с использованием `Selenide`.\
`Gradle` - для автоматической системы сборки.  \
`JUnit5` - для модульного тестирования.\
`Jenkins` - CI/CD для удаленного запуска тестов.\
`Selenoid` - для удаленного запуска браузеров в `Docker` контейнере.\
`Allure Report` - для визуализации результатов тестирования.\
`Telegram Bot` - для уведомлений о результатах тестирования.\
`Allure TestOps` - система управления тестированием
`Rest Assured` - выполняет роль обёртки над http клиентом
`Appium` - используются для управления мобильным устройством с помощью веб драйвера
`Browserstack` - для удаленного запуска мобильных автотестов
`Android_Studio` - для эмулятора мобильного устройства и получения данных для подключения к apk
.

<a name="Project"><h2>Проект</h2></a>
<a href="https://javarush.com/"><code><img width="5%" title="Steam" src="https://yt3.googleusercontent.com/ytc/APkrFKYPRuYZhFR5vGnF2c6htR6815HiRYLmhikCqrjR7w=s900-c-k-c0x00ffffff-no-rj"></code></a> Проект по автоматизации тестирования для Java-Rush, — практический онлайн-курс по обучению Java. :star2:

<a name="ImplementedСhecks"><h2>:heavy_check_mark:  Реализованные проверки:</h2></a>
<a id="cases-ui"></a>UI-кейсы:

:heavy_check_mark: Авторизация на сайте</br>

:heavy_check_mark: Запись на курс по JAVA </br>

:heavy_check_mark: Открытие страниц в Telegram/Youtube </br>

:heavy_check_mark: Поиск пользователей</br>

:heavy_check_mark: Открытие страниц Отзывы/О нас и проверка их содержимого</br>

:heavy_check_mark: Загрузка фотографии в профиль</br>

<a id="cases-api"></a>API-кейсы:

:heavy_check_mark: Открытие раздела "Игры" '</br>

:heavy_check_mark: Открытие страницы активности пользователей</br>

:heavy_check_mark: Открытие раздела лекций</br>

:heavy_check_mark:Открытие раздела "Пользователи"</br>

:heavy_check_mark:Открытие JSON сайта</br>

<a id="cases-mobile"></a>Mobile-кейсы:

:heavy_check_mark: Авторизация в приложении</br>

:heavy_check_mark: Создание нового аккаунта с прохождением теста по Java</br>

:heavy_check_mark: Добавление лайка на комментарий/лекцию </br>

:heavy_check_mark: Добавление коментария и проверка его автора и текста</br>

:heavy_check_mark: Открытие разделов Course/Java и проверка их содержимого</br>


<a name="buildInJenkins" href="https://jenkins.autotests.cloud/job/SteamProject/"><h2>👷‍♂️ Сборки в [Jenkins](https://jenkins.autotests.cloud/job/Students/job/DiplomaSteam/)<h2></a>
- <a name="buildInJenkins1"><h5>Страница сборки job в [Jenkins](https://jenkins.autotests.cloud/job/Students/job/DiplomaSteam/178/)</h5></a>

![This is an image](design/pictures/jenkins1.png)

- <a name="buildInJenkins2"><h5>Главный экран со списком job в [Jenkins](https://jenkins.autotests.cloud/job/Students/job/DiplomaSteam/)</h5></a>

![This is an image](design/pictures/jenkins2.png)

<a name="terminal"><h2>:computer: Параметры сборки в Jenkins</h2></a>

Сборка в Jenkins

- BROWSER (браузер, по умолчанию chrome)

- BROWSER_VERSION (версия браузера, по умолчанию 100.0)

- BROWSER_SIZE (размер окна браузера, по умолчанию 2500х1080)

- BASE_URL (какой адрес открывать для запуска тестов)

- REMOTE_URL (где запускать тесты)

- TASK (с какими тегами запускать тесты)


<a name="Launch_from_terminal"><h2>:computer: Запуск из терминала</h2></a>
### <a id="console-ui"></a>Локальный запуск UI-тестов

```
gradle clean steamUI
```

### <a id="console-api"></a>Локальный запуск API-тестов

```
gradle clean steamApi
```

### <a id="console-mobile"></a>Локальный запуск Mobile-тестов

```
gradle clean steamMobile
```

Удаленный запуск:

```
clean
${TASK}
clean
${TASK}
-DbaseUrl=${BASE_URL}
-DbrowserSize=${BROWSER_SIZE}
-Dbrowser=${BROWSER}
-DbrowserVersion="${BROWSER_VERSION}"
-DremoteUrl=${REMOTE_URL}
```
<a name="Allure_report"><h2>:chart_with_downwards_trend: [Allure Report](https://jenkins.autotests.cloud/job/Students/job/DiplomaSteam/178/allure/)</h2></a>

- <a name="Allure_report1"><h3>Главный экран отчета в [Allure Report](https://jenkins.autotests.cloud/job/Students/job/DiplomaSteam/178/allure/#)</h3></a>

![This is an image](design/pictures/allure.png)

-  <a name="Allure_report2"><h3>Страница с проведенными тестами в [Allure Report](https://jenkins.autotests.cloud/job/Students/job/DiplomaSteam/178/allure/#suites/5c6961ccda11b989b711be0fa000af14/e117dc1bb946ebe9/)</h3></a>

![This is an image](design/pictures/allure1.png)

<a name="Integration_Allure_TestOps"><h2>:bar_chart: Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/24564)</h2></a>

- <a name="Integration_Allure_TestOps1"><h3>Экран с результатами запуска тестов</h3></a>

![This is an image](design/pictures/allureTestsOp.png)


- <a name="Integration_Allure_TestOps2"><h3>Страница с тестами в [TestOps](https://allure.autotests.cloud/project/2188/test-cases/20742?treeId=4235)</h3></a>

![This is an image](design/pictures/allureTestsOp1.png)

- <a name="Integration_Allure_TestOps3"><h3>Страница с тестами из Launches в [Allure TestOps](https://allure.autotests.cloud/launch/24564/tree/369247?treeId=4235)</h3></a>

![This is an image](design/pictures/allureTestsOp2.png)

<a name="Integration_Brawserstack"><h2>:bar_chart: Примеры сборок в [Browserstack](https://app-automate.browserstack.com/dashboard/v2/builds/a30dac4f7670d214d2a0cfda3716ec3a802ad3e2/sessions/e55b3ffbab9e70fd98626e7518989f663ab82f67)</h2></a>

- <a name="Integration_Brawserstack"><h3>Экран с результатами запуска тестов</h3></a>

![This is an image](design/pictures/Brawserstack.png)

 <a name="Integration_Jira"><h2>:chart_with_upwards_trend: Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-675)</h2></a>

- <a name="Page_Jira"><h3>Страница с задачей в [Jira](https://jira.autotests.cloud/browse/HOMEWORK-675)<h3></a>

![This is an image](design/pictures/jira_task.png)

<a name="Telegram"><h2>:iphone: Отчет в [Telegram](https://t.me/+wAG3zdRUXCxmNWNi)</h2></a>

![This is an image](design/pictures/telegram.png)

<a name="Video"><h2>:movie_camera: Видео примеры прохождения тестов</h2></a>

- <a name="Video1"><h3>Пример запуска тестов через selenoid</h3></a>

https://github.com/KatasonovaMasa/Steam/assets/44576709/127ae60c-9c68-4e27-9f70-06c7aef69da7

- <a name="Video2"><h3>Пример запуска тестов через [Browserstack](https://app-automate.browserstack.com/dashboard/v2/builds/a30dac4f7670d214d2a0cfda3716ec3a802ad3e2/sessions/e55b3ffbab9e70fd98626e7518989f663ab82f67)</h3></a>

https://github.com/KatasonovaMasa/Steam/assets/44576709/35a05427-a8b1-4941-abc5-2cf98db8b66e


:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>

:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>

