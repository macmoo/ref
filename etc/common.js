var coll = document.getElementsByClassName("collapsible");
var i;
for (i = 0; i < coll.length; i++) {
    coll[i].addEventListener("click", function () {
        this.classList.toggle("active");
        var content = this.nextElementSibling;
        if (content.style.maxHeight) {
            content.style.maxHeight = null;
        } else {
            content.style.maxHeight = content.scrollHeight + "px";
        }
    });

    coll[i].nextElementSibling.addEventListener("click", function () {
        if (this.style.maxHeight) {
            this.style.maxHeight = null;
        } else {
            this.style.maxHeight = content.scrollHeight + "px";
        }
    });
}
