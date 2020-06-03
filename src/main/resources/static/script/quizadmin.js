//var eventSource = new EventSource ('/startquiz2');
document.addEventListener ('registerUser', function(event){
	$('#registeredusers').append('User joined: ' + event.data + '<p/>');
});