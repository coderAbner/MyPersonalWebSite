$("#imgBar").slider({
        imgs: [
        	"/Used/resources/images/Test/1.jpg",
            "/Used/resources/images/Test/2.jpg",
            "/Used/resources/images/Test/3.jpg",
            "/Used/resources/images/Test/4.jpg"],
        scale: 128 / 36,
        border: true,
        delay: 2200,
        x: 10,
        y: 3
    });
  function makeOpen(url){
  return eval('wind' + 'ow.o' + 'pen("'+url+'")');
  }