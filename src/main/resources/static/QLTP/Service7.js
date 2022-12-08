class Service7 {
    FillTableTopping = async () => {
        let { data: result } = await axios.get("/api/tp/getAllTP");
        $$('formTP').clear();
        $$('tableTP').clearAll();
        // console.log(result);
        $$('tableTP').parse(result);
    }
    
    clickAdd = async () => {
        let data = $$('formTP').getValues();
        let dt = {
            maTopping: data.maTopping,
            tenTopping: data.tenTopping,
            gia: data.gia
        };
        let temp = await axios.post("/api/tp/insertTP", dt);
        console.log(temp);
        this.clickNew();
        this.FillTableTopping();
    };
    
    clickDelete = async () => {
        let data = $$('formTP').getValues();
        let temp = await axios.get("/api/tp/deleteTP", { params: { maTopping: data.maTopping } });
        console.log(temp);
        this.clickNew();
        this.FillTableTopping();
    }
    
    clickUpdate = async () => {
        let data = $$('formTP').getValues();
        let dt = {
            maTopping: data.maTopping,
            tenTopping: data.tenTopping,
            gia: data.gia
        };
        let temp = await axios.post("/api/tp/updateTP", dt);
        console.log(temp);
        this.clickNew();
        this.FillTableTopping();
    };
    
    clickNew = () => {
        $$('formTP').clear();
    }
}
export default new Service7();