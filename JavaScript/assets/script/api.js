/**
 * Esta maneira é semelhante ao AJAX ou se não é o próprio AJAX	
 * Função para buscar os posts da API JSONPlaceholder
 */

/**
 * Função para exibir os posts no arquivo index.html
 * @param {Array} posts - um array de objetos com os posts que serão exibidos
 */
function fetchPost() {
  let xhttp = new XMLHttpRequest();

  xhttp.open("GET", "https://jsonplaceholder.typicode.com/posts", true);

  xhttp.onload = function () {
    if (this.status >= 200 && this.status < 300) {
      var posts = JSON.parse(this.responseText);
      displayPosts(posts);
    } else {
      console.log("Error to make a post!", this.statusText);
    }
  };

  xhttp.onerror = function () {
    console.error("Error to make a post!", this.statusText);
  };

  xhttp.send();
}

function displayPosts(posts) {
  let apiContainer = document.getElementById("apiSection");

  posts.forEach(function (post) {
    let postElement = document.createElement("div"); // tag <div></div>

    postElement.classList.add("post"); // nome da classe

    postElement.innerHTML = `
      <h2>${post.title}</h2>
      <p>${post.body}</p>
      <div style="margin: 1em;" id="buttons">
        <button class="btn btn-primary" title="Like" onclick="likePost(${post.id})">&#128077; <span id="likes_${post.id}">0</span></button>
        <button class="btn btn-danger" title="Dislike" onclick="dislikePost(${post.id})">&#128078; <span id="dislikes_${post.id}">0</span></button>
      </div>
      `;
      apiContainer.appendChild(postElement); // vai por o postElement dentro do apiContainer
  });
}

function likePost(postId) {
  let likesElement = document.getElementById(`likes_${postId}`);
  let likes = parseInt(likesElement.innerText);
  likes++;
  likesElement.innerText = `${likes}`;
}

function dislikePost(postId) {
  let dislikesElement = document.getElementById(`dislikes_${postId}`);
  let dislikes = parseInt(dislikesElement.innerText);
  dislikes++;
  dislikesElement.innerText = `${dislikes}`;
}

let button = document.querySelector("#callAPI");
button.addEventListener("click", fetchPost); // chama a função para buscar os posts da API