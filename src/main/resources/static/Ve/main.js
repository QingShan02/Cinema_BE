import Service1 from './Service1.js';
const ve = () => ({
    view: "scrollview",
    id: 've',
    scroll: "y",
    body: {
        rows: [{
            view: "select",
            id: "combo1",
            inputWidth: 200,
            options: [],
            select:0,
            on: {
                onChange: function (s) {
                    Service1.callChart(s);
                }
            }
        }, {

            id: 'dashboard1',
            view: "chart",
            type: "stackedBar",
            value: "#soluong#",
            preset: "alpha",
            height: 400,
            tooltip: {
                template: "Ngày <span class='title'>#ngay#</span><br/>số vé <span class='title'>#soluong#</span>"
            },
            xAxis: {
                template: function (obj) {
                   return  webix.Date.dateToStr("%d")(obj.$unit)
                    // return obj.$unit.getDate() == 15 ? webix.Date.dateToStr("%M")(obj.$unit) : ""
                },
                lineColor: function (obj) {
                    //  && (obj.$unit.valueOf() == (new Date(2019, 1, 1)).valueOf())
                    return (obj.$unit) ? "#737373" : "#cfcfcf"
                },
                value: function (obj) {
                    return webix.Date.strToDate("%Y.%m.%d")(obj.ngay);
                },
                units: {
                    start: new Date(2022, 8, 1),
                    end: new Date(2022, 8, 30),
                    next: function (d) {
                        return webix.Date.add(d, 1, "day", true);
                    }
                }
            },
            yAxis: {
                start: 0,
                step: 10,
                end: 100
            },
            data: [

            ]
        }]
    }
})

export default ve();