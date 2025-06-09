public class java {
    function toggleCard(card) {
  const conteudo = card.querySelector(".conteudo");
  const todos = document.querySelectorAll(".conteudo");

  todos.forEach((el) => {
    if (el !== conteudo) el.style.display = "none";
  });

  conteudo.style.display =
    conteudo.style.display === "block" ? "none" : "block";
}

    
}
