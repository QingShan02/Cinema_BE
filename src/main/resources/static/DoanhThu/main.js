const doanhthu = () => (
    {

        view: "chart",
        id: 'dashboard2',
        type: "bar",
        // width: 600,
        // height: 250,
        value: "#sales#",
        gradient: function (gradient) {
            gradient.addColorStop(1.0, "#FF0000");
            gradient.addColorStop(0.2, "#FFFF00");
            gradient.addColorStop(0.0, "#00FF22");
        },
        alpha: 0.8,
        radius: 2,
        border: false,
        xAxis: {
            template: "'#year#"
        },
        yAxis: {
            start: 0,
            end: 100,
            step: 10,
            template: function (obj) {
                return (obj % 20 ? "" : obj)
            }
        },
        data: [
            { id: 1, sales: 20, year: "02" },
            { id: 2, sales: 55, year: "03" },
            { id: 3, sales: 40, year: "04" },
            { id: 4, sales: 78, year: "05" },
            { id: 5, sales: 61, year: "06" },
            { id: 6, sales: 35, year: "07" },
            { id: 7, sales: 80, year: "08" },
            { id: 8, sales: 50, year: "09" },
            { id: 9, sales: 65, year: "10" },
            { id: 10, sales: 59, year: "11" }]

    }
)

export default doanhthu();