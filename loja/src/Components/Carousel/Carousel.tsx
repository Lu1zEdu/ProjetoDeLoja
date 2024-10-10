// components/Carousel.js
"use client";

import Slider from "react-slick";

const NextArrow = (props: { onClick: unknown; }) => {
    const { onClick } = props;
    return (
        <div className="arrow next" onClick={onClick}>
            &#10095; {/* Unicode para a seta direita */}
        </div>
    );
};

const PrevArrow = (props: { onClick: unknown; }) => {
    const { onClick } = props;
    return (
        <div className="arrow prev" onClick={onClick}>
            &#10094; {/* Unicode para a seta esquerda */}
        </div>
    );
};

const Carousel = () => {
    const settings = {
        dots: true,
        infinite: true,
        speed: 500,
        slidesToShow: 1,
        slidesToScroll: 1,
        nextArrow: <NextArrow onClick={undefined} />,
        prevArrow: <PrevArrow onClick={undefined} />
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