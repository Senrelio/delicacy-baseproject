Ext.define('erp.view.OnFileUploadPanel', {
    extend: 'Ext.container.Container',
    xtype: 'onFileUploadPanel',
    controller: 'onFileUploadController',
    
    profiles: {
        classic: {
            labelWidth: 70
        },
        neptune: {
            labelWidth: 70
        },
        graphite: {
            labelWidth: 120
        }
    },
    width: '100%',
    fullscreen:true,
    layout: {
        type: 'vbox',
        align: 'stretch'
    },
    
    defaults: {
        xtype: 'form',
        layout: 'anchor',

        bodyPadding: 10,
        style: {
            'margin-bottom': '20px',
            'margin-top': '20px'
        },

        defaults: {
            anchor: '100%'
        }
    },

    items: [{
        frame: false,
        bodyPadding: '10 10 180',
        reference: 'fileForm',

        defaults: {
            anchor: '100%',
            allowBlank: false,
            msgTarget: 'side',
            labelWidth: 70,

        },

        items: [{
            xtype: 'displayfield',
            fieldStyle:'color:red;font-weight:bold',
            id:'displayFileType'
        }, {
            xtype: 'filefield',
            emptyText: '请选择文件',
            fieldLabel: '文件名称',
            name: 'Filedata',
            id: 'Filedata',
            buttonConfig: {
                text : '',
                iconCls: 'file-uploads-image-add'
            }
            ,
            afterRender: function(){
            	var fileType = this.ownerCt.ownerCt.ownerCt._FILE_TYPE;
            	var win = this;
            	var fileTypes = '';
            	var contents='';
            	switch(fileType){
            	case 1://图片
            		fileTypes = '.jpg,.gif,.bmp,.wbmp,.png,.jpeg,.JPG,.GIF,.BMP,.WBMP,.PNG,.JPEG';
            		contents = '允许上传的文件类型：图片';
            		break;
            	case 2://PDF
            		fileTypes = '.pdf,.PDF';
            		contents = '允许上传的文件类型：PDF';
            		break;
            	case 3://文档
            		fileTypes = '.doc,.docx,.docm,.dotx,.dotm,.xls,.xlsx,.xlsm,.xltx,.xltm,.xlsb,.xlam,.ppt,.pptx,.pptm,.ppsx,.potx,.potm,.ppam,.accdb,.vsd,.mpp,.DOC,.DOCX,.DOCM,.DOTX,.DOTM,.XLS,.XLSX,.XLSM,.XLTX,.XLTM,.XLSB,.XLAM,.PPT,.PPTX,.PPTM,.PPSX,.POTX,.POTM,.PPAM,.ACCDB,.VSD,.MPP';
            		contents = '允许上传的文件类型：文档(word,excel,ppt...)';
            		break;
            	case 4://音频
            		fileTypes = '.au,.aiff,.cd,.ogg,.mp3,.asf,.wma,.wav,.mp3pro,.rm,.real,.ape,.module,.midi,.vqf,.AU,.AIFF,.CD,.OGG,.MP3,.ASF,.WMA,.WAV,.MP3PRO,.RM,.REAL,.APE,.MODULE,.MIDI,.VQF';
            		contents = '允许上传的文件类型：音频文件';
            		break;
            	case 5://视频
            		fileTypes = '.avi,.rmvb,.rm,.asf,.divx,.mpg,.mpeg,.mpe,.wmv,.mp4,.mkv,.vob,.mov,.moov,.movie,.flv,.qt,.ram,.AVI,.RMVB,.RM,.ASF,.DIVX,.MPG,.MPEG,.MPE,.WMV,.MP4,.MKV,.VOB,.MOV,.MOOV,.MOVIE,.FLV,.QT,.RAM';
            		contents = '允许上传的文件类型：视频文件';
            		break;
            	case 6://压缩文件
            		fileTypes = '.rar,.tar,.zip,.GZip,.cab,.uue,.arj,.bz2,.lzh,.jar,.ace,.iso,.7z,.z,.RAR,.TAR,.ZIP,.GZIP,.CAB,.UUE,.ARJ,.BZ2,.LZH,.JAR,.ACE,.ISO,.7Z,.Z';
            		contents = '允许上传的文件类型：压缩文件';
            		break;
        		default:
        			contents = '允许上传的文件类型：所有文件';
        			break;
            	}
            	Ext.getCmp('displayFileType').setValue(contents);
            	var fileDom = this.getEl().down('input[type=file]');
                fileDom.dom.setAttribute("accept", fileTypes);
            }
        }],

        buttons: [{
            text: '确认',
            handler: 'fileSubmit'
        }, {
            text: '取消',
            handler: 'fileCancel'
        }]
    }]

});
