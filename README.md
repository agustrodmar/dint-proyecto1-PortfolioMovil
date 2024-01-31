dint-proyecto1-PortfolioMovil
![Captura de pantalla 2024-01-31 a las 17 35 15 (2)](https://github.com/agustrodmar/dint-proyecto1-PortfolioMovil/assets/118189241/71c0886c-6bf9-4005-9156-0d277983411d)


Descripción
Este proyecto forma parte de mis estudios de Diseño y Desarrollo de interfaces para I.E.S Rafael Alberti.
A lo largo del proyecto, he llevado a cabo un portfolio personal como informático, diseñado inicialmente 
en Figma y luego implementado en Android utilizando Kotlin y Jetpack Compose, siguiendo el patrón de diseño 
MVVM.


Estructura del Proyecto
El proyecto se divide en varias partes:

data: Contiene la clase ScreenNavigation, que se encarga de la navegación en la aplicación.
ui: Contiene las diferentes pantallas de la aplicación:

MainScreen: Pantalla principal.
![MainScreen](https://github.com/agustrodmar/dint-proyecto1-PortfolioMovil/assets/118189241/f9f48d64-ec13-4c38-973c-5abf21dbd440)
Es la pantalla inicial del proyecto. Aparece mi nombre, así como unas banderas que permiten la  selección
de idioma en pantalla, así como pinchar sobre los enlaces a mis distintas redes sociales donde he 
participado como desarrollador multiplataforma. 

AboutMeScreen: Pantalla sobre mí.
![aboutMeScreen](https://github.com/agustrodmar/dint-proyecto1-PortfolioMovil/assets/118189241/1660ea25-1995-46d0-b7a0-76dc0fa6ffbf)
AboutMe es la primera pantalla que ofrece un resumen de mi persona, de mi trayectoria, objetivos y los
valores profesionales.

TechnologiesScreen: Pantalla de tecnologías.
![technologiesScreen](https://github.com/agustrodmar/dint-proyecto1-PortfolioMovil/assets/118189241/b9975066-5f21-4d02-9a88-b63446372266)
Es una pantalla que permite al usuario ver las diferentes tecnologías con las que he trabajado durante
mis años como programador. No tiene mucha profundidad, más allá de la opción futurible de poder navegar
a la página oficial de las tecnologías que manejo para arrojar más información al usuario.

CertificatesScreen: Pantalla de certificados.
![CertificatesScreen](https://github.com/agustrodmar/dint-proyecto1-PortfolioMovil/assets/118189241/6287c02d-9964-4c0b-822c-2eaee6c293f4)
La pantalla que muestra algunas de mis titulaciones relacionadas con el sector de la informática, aquí
el usuario tiene la  posibilidad de ver mi historial académico.

ProjectsScreen: Pantalla de proyectos.
![ProjectsScreen](https://github.com/agustrodmar/dint-proyecto1-PortfolioMovil/assets/118189241/ba73b918-7d87-496e-a12d-2532fee1cb69)
ProjectsScreen es una pantalla que muestra algunos de los proyectos en los que he estado trabajando, 
permitiendo  al usuario  navegar entre las diferentes Cards a través de scroll y navegando  a los proyectos
en cuestión (Lo que no está implementado, pues no es el fin del proyecto).

ContactScreen: Pantalla de contacto.
![ContactMeScreen](https://github.com/agustrodmar/dint-proyecto1-PortfolioMovil/assets/118189241/371ad1d5-e3e7-4165-b919-96f5acb1f5b8)
La pantalla de Contacto, incluye tres boxes que permiten al usuario rellenar sus datos a través de un formulario,
acompañados de un botón que envía un mensaje a mi bandeja de correo electrónico profesional (La funcionalidad
no  está implementada en este proyecto).

NavigationMenu: Menú de navegación.
![Captura de pantalla 2024-01-24 a las 20 17 52 (2)](https://github.com/agustrodmar/dint-proyecto1-PortfolioMovil/assets/118189241/d3dd0658-d321-42f3-9c20-abd2938a766c)
Es el menú de navegación que permite trasladarse entre pantallas por la aplicación.


ScrollScreen: Pantalla de desplazamiento.
Funcionalidad no implementada por decisión de diseño. Permite navegar en scroll 
vertical entre las diferentes pantallas de la App.

Usabilidad del proyecto

Pruebas de diseño y usabilidad.
La aplicación ha pasado, con todas sus pantallas dispnibles por diversos tests de funcionalidad
que prueban que el diseño es correcto y cumple con el  fin que prometía con el diseño inicial
en Figma.

3M VAS
Dentro de este mismo repositorio se pueden consultar los resultados obtenidos por las distintas 
pantallas en los tests  de diseño de esta plataforma, los cuales incluyen una prueba de calor

![aboutMeScreen_VAS_Heatmap](https://github.com/agustrodmar/dint-proyecto1-PortfolioMovil/assets/118189241/fc1c99a5-3243-4793-96d7-6833cc654dd9)
Ejemplo de prueba de calor en la pantalla de "AboutMeScreen".

![Capturadepantalla2024-01-29alas23 58 39_VAS_VisualSequence](https://github.com/agustrodmar/dint-proyecto1-PortfolioMovil/assets/118189241/e1ac6cbf-4bae-453f-baff-afb8a694aedd)
Ejemplo de prueba de secuencia visual en la pantalla de "ContactMeScreen".

![technologiesScreen_VAS_AreaOfInterest](https://github.com/agustrodmar/dint-proyecto1-PortfolioMovil/assets/118189241/70cc257b-43f1-493d-b38a-6b8593c0e2ea)
Ejemplo de prueba de áreas de interés en la pantalla "TechnologiesScreen".


Lyssna
Las pantallas de esta app han sido sometidas por varias personas anónimas al test de  los
5 segundos a través de Lyssna.com.

![Captura de pantalla 2024-01-31 a las 18 01 43 (2)](https://github.com/agustrodmar/dint-proyecto1-PortfolioMovil/assets/118189241/387bbf85-8cea-4899-9bb0-6895da33959d)
TechnologiesScreen es sometida al feedback de los usuarios a través del test de los 5 segundos.
