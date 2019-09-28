Ext.define('erp.uploadtest.view.uploadTestController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.uploadTestController',
    upload: function (btn) {
        const formData = new FormData();
        const files = document.querySelector('input[name="files"]').files;
        for (let i = 0; i < files.length; i++) {
            formData.append("file"+i, files[i])
        }
        const upload = () => {
            fetch("http://127.0.0.1:9080/FileUpload", {
                method: 'POST',
                mode: 'cors',
                headers: {
                    // "Content-Type": "multipart/form-data",
                },
                body: formData
            }).then(
                response => response.json(),
            ).then(
                success => console.log(success)
            ).then(
                error => console.log(error)
            )
        };
        upload();
    }
});