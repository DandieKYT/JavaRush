# UI и API автотесты для сайта [Java-Rush](https://javarush.com/) — практический онлайн-курс по обучению Java.
![image](https://github.com/DandieKYT/JavaRush/assets/75677738/cd08eb3b-22da-4c6e-819b-f9fc04ed6361)



# <a name="TableOfContents">Содержание страницы</a>
+ [:trophy: Инструменты и технологии](#MyToolsAndTechnologies)
+ [Описаниe](#Description)
+ [Проект](#Project)
+ [🗺️ Mind-карта сайта](#Mind)
+ [✍️ Ручные тест-кейсы в Allure TestOps](#Manual)
  + [Тест-кейс "Авторизация по секретному ключу"](#Manual1)
  + [Тест-кейс "Запись на курс по JAVA"](#Manual2)
  + [Тест-кейс "Добавление/редактирование личных данных"](#Manual3)
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
`Allure TestOps` - система управления тестированием.\
`Rest Assured` - выполняет роль обёртки над http клиентом
.

<a name="Project"><h2>Проект</h2></a>
<a href="https://javarush.com/"><code><img width="5%" title="Steam" src="https://yt3.googleusercontent.com/ytc/APkrFKYPRuYZhFR5vGnF2c6htR6815HiRYLmhikCqrjR7w=s900-c-k-c0x00ffffff-no-rj"></code></a> Проект по автоматизации тестирования для Java-Rush, — практический онлайн-курс по обучению Java. :star2:

<a name="Mind"><h2> 🗺️ Майнд-карта Java-Rush</h2></a>

![картаJR](https://github.com/DandieKYT/JavaRush/assets/75677738/feee57cd-f8e6-430f-bc39-82ca74e7c78f)

<a name="Manual"><h2> ✍️ Ручные тест-кейсы в [Allure TestOps](https://allure.autotests.cloud/project/3488/test-cases/29925?treeId=6806&search=W3siaWQiOiJ0eXBlIiwidHlwZSI6InRlc3RDYXNlVHlwZUFycmF5IiwidmFsdWUiOlsibWFudWFsIl19XQ%3D%3D)</h2></a>

- <a name="Manual1"><h3>Тест-кейс ["Авторизация по секретному ключу"](https://allure.autotests.cloud/project/3488/test-cases/29884?treeId=6806&search=W3siaWQiOiJ0eXBlIiwidHlwZSI6InRlc3RDYXNlVHlwZUFycmF5IiwidmFsdWUiOlsibWFudWFsIl19XQ%3D%3D)</h3></a>
![image](https://github.com/DandieKYT/JavaRush/assets/75677738/d4ea1e2c-6e46-4e26-9ef0-6bea0fa187ce)

- <a name="Manual2"><h3>Тест-кейс ["Запись на курс по JAVA"](https://allure.autotests.cloud/project/3488/test-cases/29746?treeId=6806&search=W3siaWQiOiJ0eXBlIiwidHlwZSI6InRlc3RDYXNlVHlwZUFycmF5IiwidmFsdWUiOlsibWFudWFsIl19XQ%3D%3D)</h3></a>
![image](https://github.com/DandieKYT/JavaRush/assets/75677738/e48a2b2b-74d5-4e42-a5b2-bc7368cc450d)

- <a name="Manual3"><h3>Тест-кейс ["Добавление/редактирование личных данных"](https://allure.autotests.cloud/project/3488/test-cases/29925?treeId=6806&search=W3siaWQiOiJ0eXBlIiwidHlwZSI6InRlc3RDYXNlVHlwZUFycmF5IiwidmFsdWUiOlsibWFudWFsIl19XQ%3D%3D)</h3></a>
![image](https://github.com/DandieKYT/JavaRush/assets/75677738/9e9f8e80-ecd8-43f1-b755-7bf4473d1e71)


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



<a name="buildInJenkins" href="https://jenkins.autotests.cloud/job/JavaRush/"><h2>👷‍♂️ Сборки в [Jenkins](https://jenkins.autotests.cloud/job/JavaRush1/job/JavaRush_UI_API/)<h2></a>
- <a name="buildInJenkins1"><h5>Главный экран со списком job в [Jenkins](https://jenkins.autotests.cloud/job/JavaRush/100/)</h5></a>

![image](https://github.com/DandieKYT/JavaRush/assets/75677738/adaba9f4-ebea-4478-b820-9093c46d3884)




- <a name="buildInJenkins2"><h5>Страница сборки job в [Jenkins](https://jenkins.autotests.cloud/job/JavaRush1/job/JavaRush_UI_API/3/)</h5></a>

![image](https://github.com/DandieKYT/JavaRush/assets/75677738/0ec15516-482f-4765-889a-f9a1d3e5fe47)



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
<a name="Allure_report"><h2>:chart_with_downwards_trend: [Allure Report](https://jenkins.autotests.cloud/job/JavaRush1/job/JavaRush_UI_API/3/allure/)</h2></a>

- <a name="Allure_report1"><h3>Главный экран отчета в [Allure Report](https://jenkins.autotests.cloud/job/JavaRush1/job/JavaRush_UI_API/3/allure/)</h3></a>

![image](https://github.com/DandieKYT/JavaRush/assets/75677738/4cb52020-d33a-453e-9579-11a264965f82)



-  <a name="Allure_report2"><h3>Страница с проведенными тестами в [Allure Report](https://jenkins.autotests.cloud/job/JavaRush1/job/JavaRush_UI_API/3/allure/#suites/c6e095b3810bf1b3b1d089748842a365/21e4a840cb73bc79/)</h3></a>

![image](https://github.com/DandieKYT/JavaRush/assets/75677738/8739d0d0-044e-457e-afb4-172cea5d4b12)


<a name="Integration_Allure_TestOps"><h2>:bar_chart: Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/38959/?search=W3siaWQiOiJzdGF0dXMiLCJ0eXBlIjoidGVzdFN0YXR1c0FycmF5IiwidmFsdWUiOlsicGFzc2VkIl19XQ%3D%3D&treeId=0)</h2></a>

- <a name="Integration_Allure_TestOps1"><h3>Экран с результатами запуска тестов</h3></a>

![image](https://github.com/DandieKYT/JavaRush/assets/75677738/cc1ae6c5-f1c8-4ef1-abea-0957d0fa39fd)


- <a name="Integration_Allure_TestOps2"><h3>Страница с тестами в [TestOps](https://allure.autotests.cloud/project/3488/test-cases/31464?search=W3siaWQiOiJzdGF0dXMiLCJ0eXBlIjoibG9uZ0FycmF5IiwidmFsdWUiOlsiLTMiXX1d&treeId=6806)</h3></a>

![image](https://github.com/DandieKYT/JavaRush/assets/75677738/3f66aa30-c559-46dc-8d7e-8b40a95caf51)



- <a name="Integration_Allure_TestOps3"><h3>Страница с тестами из Launches в [Allure TestOps](https://allure.autotests.cloud/launch/38959/tree/635433?search=W3siaWQiOiJzdGF0dXMiLCJ0eXBlIjoidGVzdFN0YXR1c0FycmF5IiwidmFsdWUiOlsicGFzc2VkIl19XQ%3D%3D&treeId=6806)</h3></a>

![image](https://github.com/DandieKYT/JavaRush/assets/75677738/e34d1dbd-65e0-498d-adfd-87edc3a5eb9b)


<a name="Telegram"><h2>:iphone: Отчет в [Telegram](https://t.me/+wAG3zdRUXCxmNWNi)</h2></a>

![image](https://github.com/DandieKYT/JavaRush/assets/75677738/790d4620-9e65-4f93-a95b-9e4066db80d1)

<a name="Video"><h2>:movie_camera: Видео примеры прохождения тестов</h2></a>

- <a name="Video1"><h3>Пример запуска тестов через Selenide </h3></a>


https://github.com/DandieKYT/JavaRush/assets/75677738/a96f0f64-b136-45e5-bb69-0a8296c9d929



