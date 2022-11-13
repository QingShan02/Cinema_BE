class Service4 {
    FillTablePhim = async () => {
        let { data: result } = await axios.get("/api/phim/getAllPhim");
        $$('formP').clear();
        $$('tableP').clearAll();
        $$('tableP').parse(result);
    }
    
    clickNew = () => {
        $$('formP').clear();
    }
}
export default new Service4();