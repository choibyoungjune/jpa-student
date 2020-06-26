//$(document).ready(function() {
//    $('.header').height($(window).height())
//})

window.onresize = window.onload = function() {
    document.getElementById('idHeader').style.height = this.innerHeight + 'px'
}