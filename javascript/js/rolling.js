
var rollingNewsInterval;
var rollingTimesquareInterval;

		function startRollingNews(){
			rollingNewsInterval= setInterval(() => {
				if(!$('.rolling-news .news-roll').is(':animated')){
					$('.rolling-news .news-roll').first().animate({'margin-top':'-24px'},900,function(){
						$(this).detach().appendTo('.rolling-news');
						$(this).removeAttr('style');
					})
				}
			}, 1000);

        }
        function startRollingTimeSquare(){
            rollingTimesquareInterval = setInterval(() => {
				if(!$('.timesquare-card-container .timesquare-card-roll').is(':animated')){
					$('.timesquare-card-container .timesquare-card-roll').first().animate({'margin-left':'-281px'},1500,function(){
						$(this).detach().appendTo('.timesquare-card-container');
						$(this).removeAttr('style');
					})
				}
			}, 2000);
        }
 $(function(){
     //화면 로딩 완료후 연합 뉴스 롤링
    startRollingNews();
    $('.rolling-news .news-roll').hover(function(){
        // 마우스 호버시 롤링중지
        clearInterval(rollingNewsInterval);
    },function(){
        // 떼면 재시작
        startRollingNews();
    })

    $('.timesquare-card').hover(function(){
        clearInterval(rollingTimesquareInterval);
    },function(){
        startRollingTimeSquare();
    })

})