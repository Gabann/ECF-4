<!--suppress ALL, HtmlUnknownAnchorTarget -->

<a id="readme-top"></a>

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]

<h3 align="center">ECF-4</h3>


<div align="center">
  <p>
    A spring boot job offer application
    <br />
    <a href="https://github.com/Gabann/ECF-4/tree/main/documentation"><strong>Explore the docs »</strong></a>
    <br />
    <a href="https://github.com/gabann/ECF-4/issues">Report Bug</a>
    ·
    <a href="https://github.com/gabann/ECF-4/issues">Request Feature</a>
  </p>
</div>


<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#preview">Preview</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->

## About the Project

This app has been built in half a day as part of an exam for my study at [M2I](https://www.m2iformation.fr/).

The goal was to create a job offer management system using Java, Spring boot and JDBC.

### Features

- Create, read, update and delete for job offers.
- Create, read, update and delete Candidates.
- Create, read, update and delete Job interviews.
- Accepting or refusing a candidate for a job interview.
- Displaying the list of candidates for a job interview.
- Displaying the list of job interviews for a job offer.

### Built With

Tech stack:
[![Java][JavaBadge]][JavaUrl]
[![Maven][MavenBadge]][MavenUrl]
[![MySQL][MySQLBadge]][MySQLUrl]
![Dotenv][DotenvBadge]
[![JDBC][JDBCBadge]][JDBCUrl]
[![Bootstrap][BootstrapBadge]][BootstrapUrl]
[![ThymeLeaf][ThymeLeafBadge]][ThymeLeafUrl]

Code quality:
[![SonarLint][SonarLintBadge]][SonarLintUrl]
[![Junit][JunitBadge]][JunitUrl]

<div align="right"><a href="#readme-top">back to top</a></div>


<!-- GETTING STARTED -->

## Getting Started

### Prerequisites

- [JDK](https://www.oracle.com/java/technologies/downloads/) >= 17
- [MySQL](https://www.mysql.com/)
- [Maven](https://maven.apache.org/)

### Installation

```
# Clone the project:
git clone https://github.com/Gabann/ECF-4.git
cd .\ECF-4
```

Rename the `src/main/resources/.env.example/.env.example` file to `.env` and fill in the database connection information.

<div align="right"><a href="#readme-top">back to top</a></div>


<!-- USAGE EXAMPLES -->

## Usage

Run the application with your Spring Boot configuration.

<div align="right"><a href="#readme-top">back to top</a></div>


<!-- PREVIEW -->

## Preview

<div style="display: flex; flex-wrap: wrap; justify-content: space-around;">
<img src="./documentation/Screenshots/Screenshot 2024-07-04 at 16-42-06 Index.png" alt="App Screenshot" width="200"/>
<img src="./documentation/Screenshots/Screenshot 2024-07-04 at 16-42-25 Title.png" alt="App Screenshot" width="200"/>
<img src="./documentation/Screenshots/Screenshot 2024-07-04 at 16-42-32 Title.png" alt="App Screenshot" width="200"/>
<img src="./documentation/Screenshots/Screenshot 2024-07-04 at 16-42-41 Job interview list.png" alt="App Screenshot" width="200"/>
<img src="./documentation/Screenshots/Screenshot 2024-07-04 at 16-42-50 Job offer list.png" alt="App Screenshot" width="200"/>
<img src="./documentation/Screenshots/Screenshot 2024-07-04 at 16-42-59 Add job interview.png" alt="App Screenshot" width="200"/>
<img src="./documentation/Screenshots/Screenshot 2024-07-04 at 17-06-32 Edit candidate.png" alt="App Screenshot" width="200"/>

</div>

<div align="right"><a href="#readme-top">back to top</a></div>


<!-- ROADMAP -->

## Roadmap

[//]: # (- [ ] Feature)

[//]: # (    - [ ] Nested Feature)

- [ ] Full test code coverage
- [ ] Form validation
- [ ] Secured routes with login for recruiter, candidate and admin
- [ ] Page styling and design

<div align="right"><a href="#readme-top">back to top</a></div>


<!-- CONTRIBUTING -->

## Contributing

We welcome contributions from everyone! Follow these steps to contribute:

1. **Fork** the repository.
2. **Clone** the forked repository to your local machine.
3. **Create a new branch** for your contribution.
4. **Make your changes** and **commit** them.
5. **Push** your changes to your forked repository.
6. **Open a pull request** to the main project repository.

### Contribution Guidelines

- Discuss significant changes by opening an issue first.
- Follow the existing code style and structure.
- Write clear commit messages and document your code.
- Ensure changes don't break existing functionality.
- Update documentation if necessary.

<div align="right"><a href="#readme-top">back to top</a></div>


<!-- LICENSE -->

## License

Distributed under the 'LICENSE' License. See [`LICENSE`](https://github.com/Gabann/ECF-4/blob/main/LICENSE) for more information.

<div align="right"><a href="#readme-top">back to top</a></div>


<!-- CONTACT -->

## Contact

- [![Twitter][gmail-shield]][gmail-url]
- [![LinkedIn][linkedin-shield]][linkedin-url]

<div align="right"><a href="#readme-top">back to top</a></div>


---------------------------------------------------------------

[repo-link]: https://github.com/Gabann/ECF-4

[contributors-shield]: https://img.shields.io/github/contributors/gabann/ECF-4.svg?style=for-the-badge

[contributors-url]: https://github.com/gabann/ECF-4/graphs/contributors

[forks-shield]: https://img.shields.io/github/forks/gabann/ECF-4.svg?style=for-the-badge

[forks-url]: https://github.com/gabann/ECF-4/network/members

[stars-shield]: https://img.shields.io/github/stars/gabann/ECF-4.svg?style=for-the-badge

[stars-url]: https://github.com/gabann/ECF-4/stargazers

[issues-shield]: https://img.shields.io/github/issues/gabann/ECF-4.svg?style=for-the-badge

[issues-url]: https://github.com/gabann/ECF-4/issues

[license-shield]: https://img.shields.io/github/license/gabann/ECF-4.svg?style=for-the-badge

[license-url]: https://github.com/gabann/ECF-4/blob/master/LICENSE

[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555

[linkedin-url]: https://linkedin.com/in/gabin-deboulogne/

[gmail-shield]: https://img.shields.io/badge/Gmail-EA4335.svg?style=for-the-badge&logo=Gmail&logoColor=white

[gmail-url]: mailto:gabin.deboulogne@gmail.com

[JavaBadge]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white

[JavaUrl]: https://www.java.com/

[HibernateBadge]: https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white

[HibernateUrl]: https://hibernate.org/

[MySQLBadge]: https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white

[MySQLUrl]: https://www.mysql.com/

[SonarLintBadge]: https://img.shields.io/badge/SonarLint-CB2029?logo=sonarlint&logoColor=white&style=for-the-badge

[SonarLintUrl]: https://www.sonarlint.org/

[MavenBadge]: https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white

[MavenUrl]: https://maven.apache.org/

[DotenvBadge]: https://img.shields.io/badge/Dotenv-00000F?style=for-the-badge&logo=dotenv&logoColor=white

[JDBCBadge]: https://img.shields.io/badge/JDBC-00000F?style=for-the-badge&logo=jdbc&logoColor=white

[JDBCUrl]: https://docs.oracle.com/en/java/javase/17/docs/api/java.sql/java/sql/package-summary.html

[BootstrapBadge]: https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white

[BootstrapUrl]: https://getbootstrap.com/

[JunitBadge]: https://img.shields.io/badge/Junit-25A162?style=for-the-badge&logo=junit5&logoColor=white

[JunitUrl]: https://junit.org/junit5/

[ThymeLeafBadge]: https://img.shields.io/badge/ThymeLeaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white

[ThymeLeafUrl]: https://www.thymeleaf.org/
