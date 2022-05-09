$(function () {
    //////////////////////////////////////////

    $('.top_banner i').on('click', function () {
        $('.top_banner').slideUp(5000);
    })

    $('.main_slide').on('init reInit afterChange', function () {
        let current = $('.slick-current');
        current.addClass('on').siblings().removeClass('on');
    });

    $('.main_slide').slick({
        arrow: false,
        dots: true,
        autoplay: true,
        pauseOnHover: false,
        pauseOnFocus: false,
    });


    $(".movie01 .xi-play").on("click", function () {
        $(".movie01 video").trigger("play");
    });

    $(".movie01 .xi-pause").on("click", function () {
        $(".movie01 video").trigger("pause");
    });




    //////////////////////////////////////////

});