class Service1 {
    fillTable = async() => {
        let { data: result } = await axios.get("/api/ve/getAllVe");
        $$('dashboard1').parse(result);
    }
    fillphim = async() => {
        let { data: result } = await axios.get("/api/phim/getAllPhim");
        $$('combo1').parse(result);
    }
}

export default new Service1();