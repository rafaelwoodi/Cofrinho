function teste (x, event)
		{
			event.preventDefault();
			$("#menuSup li").removeClass("active");
			$(x).addClass("active");
		}
		
		$(document).ready(function(){
				$(".menuSup").click(function(){
				$(".menuSup").removeClass("active");
				$(this).addClass("active");
			});
		});
			