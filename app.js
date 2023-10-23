const navigation = document.querySelector(".nav__lists");
const burger = document.querySelector(".nav__burger");
const links = document.querySelectorAll("a:link");
const developer = document.querySelector(".developer");

burger.addEventListener("click", () => {
  navigation.classList.toggle("nav--open");
  burger.classList.toggle("nav__burger--open");
});

navigation.addEventListener("click", () => {
  navigation.classList.remove("nav--open");
  burger.classList.remove("nav__burger--open");
});

developer.addEventListener("click", () => {
  navigation.classList.remove("nav--open");
  burger.classList.remove("nav__burger--open");
});
