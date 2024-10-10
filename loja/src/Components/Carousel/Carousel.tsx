"use client"; // Adicione esta linha no topo do arquivo
// pages/_app.js
import 'slick-carousel/slick/slick.css';
import 'slick-carousel/slick/slick-theme.css';
// components/Carousel.js
import Slider from "react-slick";

const Carousel = () => {
    const settings = {
        dots: true,
        infinite: true,
        speed: 500,
        slidesToShow: 1,
        slidesToScroll: 1
    };

    return (
        <Slider {...settings}>
            <div>
                <h3>Slide 1</h3>
            </div>
            <div>
                <h3>Slide 2</h3>
            </div>
            <div>
                <h3>Slide 3</h3>
            </div>
            <div>
                <h3>Slide 4</h3>
            </div>
        </Slider>
    );
};

export default Carousel;
