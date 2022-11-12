class Service4 {
    LoadTablePhim = async () => {
        let { data: result } = await axios.get("/api/phim/getAllPhim");
        console.log(result);
        $$('tableP').parse(result);
    }
    clickNew = () => {
        $$('formP').clear();
    }
}
export default new Service4();