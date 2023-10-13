const navigation = document.querySelector(".nav__lists");
const burger = document.querySelector(".nav__burger");
const links = document.querySelectorAll("a:link");

burger.addEventListener("click", () => {
  navigation.classList.toggle("nav--open");
  burger.classList.toggle("nav__burger--open");
});

navigation.addEventListener("click", () => {
  navigation.classList.remove("nav--open");
  burger.classList.remove("nav__burger--open");
});

links.forEach(function (link) {
  link.addEventListener("click", function (e) {
    e.preventDefault();
    const href = link.getAttribute("href");

    // Scroll back to top
    if (href === "#")
      window.scrollTo({
        top: 0,
        behavior: "smooth",
      });

    // Scroll to other links
    if (href !== "#" && href.startsWith("#")) {
      const sectionEl = document.querySelector(href);
      sectionEl.scrollIntoView({ behavior: "smooth" });
    }
  });
});
