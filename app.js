const navigation = document.querySelector(".nav__lists");
const burger = document.querySelector(".nav__burger");

burger.addEventListener("click", () => {
  navigation.classList.toggle("nav--open");
  burger.classList.toggle("nav__burger--open");
});

navigation.addEventListener("click", () => {
  navigation.classList.remove("nav--open");
  burger.classList.remove("nav__burger--open");
});
