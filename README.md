# UI, API и Mobile автотесты для сайта [Java-Rush](https://javarush.com/) — практический онлайн-курс по обучению Java.
![image](https://github.com/DandieKYT/JavaRush/assets/75677738/cd08eb3b-22da-4c6e-819b-f9fc04ed6361)



# <a name="TableOfContents">Содержание страницы</a>
+ [:trophy: Инструменты и технологии](#MyToolsAndTechnologies)
+ [Описаниe](#Description)
+ [Проект](#Project)
+ [:heavy_check_mark:  Реализованные проверки:](#ImplementedСhecks)  
  - <a href="#cases-ui"> UI
  - <a href="#cases-api"> API
+ [👷‍♂️ Сборка в Jenkins](#buildInJenkins)
    + [Страница сборки job в Jenkins](#buildInJenkins1)
    + [Главный экран со списком job в Jenkins](#buildInJenkins2)
+ [🖥 Параметры сборки в Jenkins](#terminal)
+ [:computer: Запуск из терминала](#Launch_from_terminal)
  - <a href="#console-ui"> UI
  - <a href="#console-api"> API
+ [:chart_with_downwards_trend: Allure Report](#Allure_report)
    + [Главный экран отчета в Allure Report](#Allure_report1)
    + [Страница с проведенными тестами в Allure Report](#Allure_report2)
+ [:bar_chart: Интеграция с Allure TestOps](#Integration_Allure_TestOps)
    + [Экран с результатами запуска тестов](#Integration_Allure_TestOps1)
    + [Страница с тестами в TestOps](#Integration_Allure_TestOps2)
    + [Страница с тестами из Launches в Allure TestOps](#Integration_Allure_TestOps3)
+ [:iphone: Отчет в Telegram](#Telegram)
+ [:movie_camera: Видео примеры прохождения тестов](#Video)
    + [Пример запуска тестов](#Video1)


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
.

<a name="Project"><h2>Проект</h2></a>
<a href="https://javarush.com/"><code><img width="5%" title="Steam" src="https://yt3.googleusercontent.com/ytc/APkrFKYPRuYZhFR5vGnF2c6htR6815HiRYLmhikCqrjR7w=s900-c-k-c0x00ffffff-no-rj"></code></a> Проект по автоматизации тестирования для Java-Rush, — практический онлайн-курс по обучению Java. :star2:

<a name="ImplementedСhecks"><h2>:heavy_check_mark:  Реализованные проверки:</h2></a>
<a id="cases-ui"></a>UI-кейсы:

:heavy_check_mark: Авторизация на сайте</br>

:heavy_check_mark: Запись на курс по JAVA </br>

:heavy_check_mark: Открытие страниц в Telegram/Youtube </br>

:heavy_check_mark: Поиск пользователей по имени</br>

:heavy_check_mark: Открытие страниц Отзывы/О нас и проверка их содержимого</br>

:heavy_check_mark: Загрузка фотографии в профиль</br>

<a id="cases-api"></a>API-кейсы:

:heavy_check_mark: Открытие раздела "Игры"</br>

:heavy_check_mark: Открытие страницы активности пользователей</br>

:heavy_check_mark: Открытие раздела лекций</br>

:heavy_check_mark:Открытие раздела "Пользователи"</br>

:heavy_check_mark:Открытие JSON сайта</br>



<a name="buildInJenkins" href="https://jenkins.autotests.cloud/job/JavaRush/"><h2>👷‍♂️ Сборки в [Jenkins](https://jenkins.autotests.cloud/job/JavaRush/)<h2></a>
- <a name="buildInJenkins1"><h5>Страница сборки job в [Jenkins](https://jenkins.autotests.cloud/job/JavaRush/100/)</h5></a>

![image](https://github.com/DandieKYT/JavaRush/assets/75677738/c1b3752e-0326-4800-8a92-a944b361ac0f)



- <a name="buildInJenkins2"><h5>Главный экран со списком job в [Jenkins](https://jenkins.autotests.cloud/job/JavaRush/)</h5></a>

![image](https://github.com/DandieKYT/JavaRush/assets/75677738/afe75edd-d7d1-4cc3-8718-9c3dbe57145b)


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
gradle clean UI
```

### <a id="console-api"></a>Локальный запуск API-тестов

```
gradle clean Api
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
<a name="Allure_report"><h2>:chart_with_downwards_trend: [Allure Report](https://jenkins.autotests.cloud/job/JavaRush/100/allure/)</h2></a>

- <a name="Allure_report1"><h3>Главный экран отчета в [Allure Report](https://jenkins.autotests.cloud/job/JavaRush/100/allure/)</h3></a>

![image](https://github.com/DandieKYT/JavaRush/assets/75677738/cf828172-249a-43ec-a10b-151363242ab7)


-  <a name="Allure_report2"><h3>Страница с проведенными тестами в [Allure Report](https://jenkins.autotests.cloud/job/JavaRush/100/allure/#suites/a231097a0283795f4a5780f0d13a8133/660cc25265403457/)</h3></a>

![image](https://github.com/DandieKYT/JavaRush/assets/75677738/86c0c666-772c-419e-9287-5bff8790b5dc)

<a name="Integration_Allure_TestOps"><h2>:bar_chart: Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/38392/?treeId=0)</h2></a>

- <a name="Integration_Allure_TestOps1"><h3>Экран с результатами запуска тестов</h3></a>

![image](https://github.com/DandieKYT/JavaRush/assets/75677738/dc68c9d9-9927-414d-9794-f9c14769d64b)

- <a name="Integration_Allure_TestOps2"><h3>Страница с тестами в [TestOps](https://allure.autotests.cloud/project/2188/test-cases/20742?treeId=4235)</h3></a>

![image](https://github.com/DandieKYT/JavaRush/assets/75677738/7976d3ad-09b5-4ee2-88bb-0a0e718a595a)

- <a name="Integration_Allure_TestOps3"><h3>Страница с тестами из Launches в [Allure TestOps](https://allure.autotests.cloud/launch/24564/tree/369247?treeId=4235)</h3></a>

![image](https://github.com/DandieKYT/JavaRush/assets/75677738/a6f59008-3e2b-4e7e-832e-390561e63cbd)

<a name="Telegram"><h2>:iphone: Отчет в [Telegram](https://t.me/+wAG3zdRUXCxmNWNi)</h2></a>

![image](https://github.com/DandieKYT/JavaRush/assets/75677738/790d4620-9e65-4f93-a95b-9e4066db80d1)

<a name="Video"><h2>:movie_camera: Видео примеры прохождения тестов</h2></a>

- <a name="Video1"><h3>Пример запуска тестов </h3></a>

https://github.com/DandieKYT/JavaRush/assets/75677738/ca03e546-1d02-41d6-884e-6fbb4aecaa34


