$(function () {
    //////////////////////////////////////////

    $('.top_banner i').on('click', function () {
        $('.top_banner').slideUp(1500);
    })

    $('.main_slider').on('init reInit afterChange', function () {
        let current = $('.slick-current');
        current.addClass('on').siblings().removeClass('on');
    });

    $('.main_slider').slick({
        arrow: false,
        dots: true,
        autoplay: true,
        pauseOnHover: false,
        pauseOnFocus: false,
    });


    // $(".movie .dec .xi-play").on("click", function () {
    //     $(".movie video").trigger("play");
    // });

    // $(".movie .dec .xi-pause").on("click", function () {
    //     $(".movie video").trigger("pause");
    // });

    $('.movie .dec i:nth-of-type(1)').on('click', function() {
           $('.movie video').trigger('play');
    })
    $('.movie .dec i:nth-of-type(2)').on('click', function() {
           $('.movie video').trigger('pause');
    })

    $('#myMovie').YTPlayer({
        videoURL: 'http://youtu.be/BsekcY04xvQ',
        containment: '.utube',
        autoPlay: true,
        mute: true,
        startAt: 0,
        opacity: 1,
        showcontrols: false,
        playOnlyIfVisible: true,

    });

    $('.utube i:nth-of-type(1)').on('click', function () {
        $('#myMovie').YTPPlay();
    });
    $('.utube i:nth-of-type(2)').on('click', function () {
        $('#myMovie').YTPPause();
    });

    // $('.product .container').slick({
    //     arrows: false,
    //     slidesToShow: 5,
    //     dots: true,
    // })

    // $('.product i.xi-arrow-left').on('click', function () {
    //     $('.product .container').slick('slickNext')
    // });
    // $('.product i.xi-arrow-right').on('click', function () {
    //     $('.product .container').slick('slickPrev')
    // });

    // $('.product_slider').on('init reInit afterChange', function () {
    //     let current = $('.product_slider .slick-current');
    //     current.addClass('on').siblings().removeClass('on');

    // });

    $('.product_slider').slick({
        slidesToShow: 5,
        centerMode: true,
        arrows: false,
        dots: true,
        autoplay: true,
        responsive: [
            {
              breakpoint: 768,
              settings: {
                slidesToShow: 1,
                centerMode: false,
              }
            },
          ]
    });

    $('.product_list .s_left').on('click', function () {
        $('.product_slider').slick('slickPrev');
    });
    $('.product_list .s_right').on('click', function () {
        $('.product_slider').slick('slickNext');
    });

    $('.tab_link>li').on('click', function () {
        // console.log($(this), $(this).index())
        // 위아래입력 값 같은거임 
        var idx = $(this).index();
        $('.tab_content>li').eq(idx).addClass('on').siblings().removeClass('on');
        $(this).addClass('on').siblings().removeClass();
    

    });

    $('.footer #link').on('change', function () {
        var lik = $(this).val();
        // console.log(lik)
        if (lik) window.open(lik);
    });

    $('.mbtn').on('click', function () {
        $('nav').toggleClass('on');
        $(this).toggleClass('is-active');
    });



    //////////////////////////////////////////

});