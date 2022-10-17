const doanhthu = () => (
    {

        view: "chart",
        id: 'dashboard2',
        type: "bar",
        // width: 600,
        // height: 250,
        value: "#soluong#",
        gradient: function (gradient) {
            gradient.addColorStop(1.0, "#FF0000");
            gradient.addColorStop(0.2, "#FFFF00");
            gradient.addColorStop(0.0, "#00FF22");
        },
        alpha: 0.8,
        radius: 2,
        border: false,
        xAxis: {
            template: "'#tenPhim#"
        },
        yAxis: {
            start: 0,
            end: 100,
            step: 10,
            template: function (obj) {
                return (obj % 20 ? "" : obj)
            }
        },
        data: []

    }
)

export default doanhthu();