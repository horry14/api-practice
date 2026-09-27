document.getElementById("loadBtn")!.addEventListener("click", async () => {
  const res = await fetch("http://localhost:8080/api/user/all");
  const players = await res.json();

  const tbody = document.getElementById("playerBody")!;
  console.log(players);
  tbody.innerHTML = ""; // 初期化

  players.forEach((p: any) => {
    const row = document.createElement("tr");

    row.innerHTML = `
      <td>${p.id}</td>
      <td>${p.Name}</td>
      <td>${p.Number}</td>
    `;

    tbody.appendChild(row);
  });
});
