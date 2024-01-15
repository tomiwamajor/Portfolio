* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;










































  
}

html {
  font-size: 62.5%;
  font-family: "Space Grotesk", sans-serif;
  font-weight: 400;
  transition: all 0.3s ease-in-out;
}

/* page navigation */
header {
  background-color: #010b13;
  position: fixed;
  width: 100%;
  top: 0;
  z-index: 1;
}

.nav {
  display: flex;
  align-items: center;
  justify-content: space-between;
  width: 120rem;
  padding: 2rem 0;
  margin: 0 auto;
}

.nav__logo {
  font-size: 2.4rem;
  font-weight: 900;
  color: #f5f5f5;
}

.nav__lists {
  transition: all 0.3s ease-in-out;
}

.nav__unordered {
  display: flex;
  gap: 2.5rem;
}

.nav__list {
  list-style: none;
}

.nav__list a {
  font-size: 1.6rem;
  font-weight: 700;
  text-decoration: none;
  color: #dbd7d2;
  transition: all 0.3s ease-in-out;
}

.nav__list a:hover {
  color: #fff;
}

.nav__burger {
  display: none;
  flex-direction: column;
  gap: 0.2rem;
  cursor: pointer;
}

.nav__bar {
  /* width: 2rem;
  border: solid #000 0.1rem; */
  height: 0.2rem;
  width: 2.7rem;
  background-color: #fff;
  margin: 0.2rem 0;
  opacity: 0.8;
  transition: all 0.3s ease-in-out;
}

.nav--open {
  transform: translate(0) !important;
}

.nav__bar--open .bar:nth-child(1) {
  transform: translateY(7px) rotate(45deg);
}

.nav__bar--open .bar:nth-child(2) {
  opacity: 0;
}

.nav__burger--open .bar:nth-child(3) {
  transform: translateY(-7px) rotate(-45deg);
}

/* main content division */
.developer {
  padding-top: 8rem;
}

.developer__me,
.developer__skills,
.developer__projects,
.developer__question {
  width: 110rem;
  margin: 0 auto;
  font-size: 1.6rem;
}
/* me */
.developer__me {
  margin-bottom: 4rem;
}

.height {
  height: 70vh;
}

.devme,
.devprojects,
.devskill {
  border-bottom: 0.01rem solid #010b13;
}
.devprojects,
.devskill,
.developer__question {
  padding-top: 2rem;
}

.developer__description {
  font-size: 2rem;
  font-weight: 400;
}

.hi,
.name {
  font-size: 2.2rem;
  font-weight: 700;
  color: #353839;
}

/* skills */
.developer__skills {
  margin-bottom: 10rem;
}

.skills {
  text-align: center;
  margin-bottom: 1rem;
  font-size: 2.4rem;
  font-weight: 700;
  color: #010b13;
}

.technologies {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 3rem;
}

.tech__icons {
  height: 5.4rem;
  width: 5.4rem;
  color: #808080;
  margin: auto;
}

/* projects */
.developer__projects {
  margin-bottom: 10rem;
}

.projects {
  text-align: center;
  font-size: 2.4rem;
  margin-bottom: 2rem;
  color: #010b13;
  font-weight: 700;
}

.project__box {
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  row-gap: 3rem;
  column-gap: 7rem;
  align-items: center;
}

.project {
  transition: all 0.3s ease-in-out;
}

.project:hover {
  transform: translateY(2rem);
}

.project img {
  width: 100%;
}

.project__discover {
  padding-top: 2rem;
  font-size: 2rem;
  text-align: center;
}

.project__discover p {
  /* font-size: 1.4rem; */
  font-weight: 400;
  line-height: 2rem;
}

.project__discover a {
  text-decoration: none;
  color: #353839;
}

.link {
  height: 3rem;
  width: 3rem;
  color: #993300;
}

/* question section */
.developer__question {
  text-align: center;
  margin-bottom: 5rem;
}

.question {
  font-size: 2.4rem;
  color: #010b13;
  font-weight: 600;
  padding-bottom: 2rem;
}

.contact__me a {
  font-size: 1.6rem;
  color: #fff;
  font-weight: 400;
  padding: 1rem 5rem;
  background-color: #010b13;
  text-decoration: none;
  border-radius: 1rem;
  transition: all 0.3s ease-in-out;
}

.contact__me a:hover {
  color: #993300;
  background-color: #353839;
}

/* footer */
footer {
  background-color: #010b13;
}

.contact {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 2rem;
  margin: 0 auto;
  width: 120rem;
}

.logo {
  text-decoration: none;
  font-size: 2.4rem;
  font-weight: 900;
  color: #dbd7d2;
}

.contacts {
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 8rem;
}

.me {
  text-decoration: none;
}

.me ion-icon {
  width: 3.4rem;
  height: 3.4rem;
  color: #dbd7d2;
  transition: all 0.3s ease-in-out;
}

.me ion-icon:hover {
  color: #fff;
}
