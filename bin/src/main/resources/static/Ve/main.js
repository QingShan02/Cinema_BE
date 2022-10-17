const ve = () =>({

    view: "chart",
    id: 'dashboard1',
    width: 1500,
    // height: 250,
    type: "area",
    value: "#soluong#",
    color: "#36abee",
    alpha: 0.8,
    xAxis: {
        template: "<div class='a'><p>#tenPhim#</p></div>"
    },
    yAxis: {
        start: 0,
        end: 100,
        step: 10,
        width:20,
        template: function (obj) {
            return obj % 20 ? "" : obj;
        }
    },
    tooltip: {
        template: "#soluong#"
    },
    data: []


})

export default ve();