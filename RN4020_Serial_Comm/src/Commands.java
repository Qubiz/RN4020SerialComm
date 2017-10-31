public final class Commands {

    /***************************
     * BT LE SERVICE CONSTANTS *
     ***************************/

    /** Commands should be written to this handle.*/
    public static final String CLIENT_WRITE_HANDLE_COMMANDS = "000B";
    /** Values should be written to this handle. */
    public static final String CLIENT_WRITE_HANDLE_VALUES   = "000D";
    /** This UUID is used to enable notifications/indications. */
    public static final String CLIENT_INDICATE_UUID         = "9562D5516284536BB5455CF0BD4026AD";

    /*************************
     * READ/REQUEST COMMANDS *
     *************************/

    public static final String R_ANALOG_VIDEO_TYPE          = "R_ANALOG_VIDEO_TYPE";
    public static final String R_BT_TX_POWER                = "R_BT_TX_POWER";
    public static final String R_DATETIME                   = "R_DATETIME";
    public static final String R_FLIP_HORIZONTALLY          = "R_FLIP_HORIZONTALLY";
    public static final String R_FLIP_VERTICALLY            = "R_FLIP_VERTICALLY";
    public static final String R_FREE_SD1_SPACE             = "R_FREE_SD1_SPACE";
    public static final String R_FW_UPGRADE_VERSION         = "R_FW_UPGRADE_VERSION";
    public static final String R_FW_VERSION                 = "R_FW_VERSION";
    public static final String R_IR_COLOR_LUT               = "R_IR_COLOR_LUT";
    public static final String R_IR_GAIN                    = "R_IR_GAIN";
    public static final String R_IR_ROI                     = "R_IR_ROI";
    public static final String R_IR_SCENE                   = "R_IR_SCENE";
    public static final String R_IR_VIDEO_FILE_TYPE         = "R_IR_VIDEO_FILE_TYPE";
    public static final String R_IR_ZOOM                    = "R_IR_ZOOM";
    public static final String R_LED_ENABLED                = "R_LED_ENABLED";
    public static final String R_NUM_PWM_1_STATES           = "R_NUM_PWM_1_STATES";
    public static final String R_NUM_PWM_2_STATES           = "R_NUM_PWM_2_STATES";
    public static final String R_NUM_PWM_3_STATES           = "R_NUM_PWM_3_STATES";
    public static final String R_NUM_PWM_4_STATES           = "R_NUM_PWM_4_STATES";
    public static final String R_PART_NUMBER                = "R_PART_NUMBER";
    public static final String R_PLAYBACK_FRAMERATE         = "R_PLAYBACK_FRAMERATE";
    public static final String R_PWM_1_FUNCTION             = "R_PWM_1_FUNCTION";
    public static final String R_PWM_1_STATE                = "R_PWM_1_STATE";
    public static final String R_PWM_2_FUNCTION             = "R_PWM_2_FUNCTION";
    public static final String R_PWM_2_STATE                = "R_PWM_2_STATE";
    public static final String R_PWM_3_FUNCTION             = "R_PWM_3_FUNCTION";
    public static final String R_PWM_3_STATE                = "R_PWM_3_STATE";
    public static final String R_PWM_4_FUNCTION             = "R_PWM_4_FUNCTION";
    public static final String R_PWM_4_STATE                = "R_PWM_4_STATE";
    public static final String R_PWM_LUT_STATE_1            = "R_PWM_LUT_STATE_1";
    public static final String R_PWM_LUT_STATE_2            = "R_PWM_LUT_STATE_2";
    public static final String R_PWM_LUT_STATE_3            = "R_PWM_LUT_STATE_3";
    public static final String R_PWM_ROI_STATE_1            = "R_PWM_ROI_STATE_1";
    public static final String R_PWM_ROI_STATE_2            = "R_PWM_ROI_STATE_2";
    public static final String R_PWM_ROI_STATE_3            = "R_PWM_ROI_STATE_3";
    public static final String R_PWM_SCENE_STATE_1          = "R_PWM_SCENE_STATE_1";
    public static final String R_PWM_SCENE_STATE_2          = "R_PWM_SCENE_STATE_2";
    public static final String R_PWM_SCENE_STATE_3          = "R_PWM_SCENE_STATE_3";
    public static final String R_RAD_AIR_TEMP               = "R_RAD_AIR_TEMP";
    public static final String R_RAD_AIR_TEMP_SRC           = "R_RAD_AIR_TEMP_SRC";
    public static final String R_RAD_EMISSIVITY             = "R_RAD_EMISSIVITY";
    public static final String R_RAD_HUMIDITY               = "R_RAD_HUMIDITY";
    public static final String R_RAD_HUMIDITY_SRC           = "R_RAD_HUMIDITY_SRC";
    public static final String R_RAD_OT_ALT                 = "R_RAD_OT_ALT";
    public static final String R_RAD_OT_ALT_THRESH          = "R_RAD_OT_ALT_THRESH";
    public static final String R_RAD_OT_STL                 = "R_RAD_OT_STL";
    public static final String R_RAD_OT_STL_THRESH          = "R_RAD_OT_STL_THRESH";
    public static final String R_RAD_SKY_COND               = "R_RAD_SKY_COND";
    public static final String R_RAD_SKY_COND_SRC           = "R_RAD_SKY_COND_SRC";
    public static final String R_RECORD_MODE                = "R_RECORD_MODE";
    public static final String R_RECORD_STATE_TONE          = "R_RECORD_STATE_TONE";
    public static final String R_RECORD_STATUS              = "R_RECORD_STATUS";
    public static final String R_SCENE_METER                = "R_SCENE_METER";
    public static final String R_SD1_CARD_PRESENT           = "R_SD1_CARD_PRESENT";
    public static final String R_SERIAL_DATA_RATE           = "R_SERIAL_DATA_RATE";
    public static final String R_SERIAL_NUMBER              = "R_SERIAL_NUMBER";
    public static final String R_SERIAL_PROTOCOL            = "R_SERIAL_PROTOCOL";
    public static final String R_SNAPSHOT_TONE              = "R_SNAPSHOT_TONE";
    public static final String R_SPOT_METER                 = "R_SPOT_METER";
    public static final String R_STILL_FILE_TYPE            = "R_STILL_FILE_TYPE";
    public static final String R_STILL_PERIOD               = "R_STILL_PERIOD";
    public static final String R_TARGET_RANGE               = "R_TARGET_RANGE";
    public static final String R_TARGET_RANGE_SRC           = "R_TARGET_RANGE_SRC";
    public static final String R_TAU_ACE                    = "R_TAU_ACE";
    public static final String R_TAU_DDE                    = "R_TAU_DDE";
    public static final String R_TAU_SSO                    = "R_TAU_SSO";
    public static final String R_TEMPERATURE_UNIT           = "R_TEMPERATURE_UNIT";
    public static final String R_TIMELAPSE_PERIOD           = "R_TIMELAPSE_PERIOD";
    public static final String R_USB_INTERFACE              = "R_USB_INTERFACE";

    /******************
     * WRITE COMMANDS *
     ******************/

    /** RECORD MODE */

    public static final String W_RECORD_MODE                = "W_RECORD_MODE";
    // Values
    public static final String RECORD_MODE_VIDEO            = "REALTIME_VIDEO";
    public static final String RECORD_MODE_PERIODIC_STILL   = "PERIODIC_STILL";
    public static final String RECORD_MODE_TIMELAPSE        = "TIMELAPSE";

    public static final String W_STILL_PERIOD               = "W_STILL_PERIOD";
    // Values
    public static final int STILL_PERIOD_0                  = 0x00;
    public static final int STILL_PERIOD_1                  = 0x01;
    public static final int STILL_PERIOD_2                  = 0x02;
    public static final int STILL_PERIOD_3                  = 0x03;
    public static final int STILL_PERIOD_4                  = 0x04;
    public static final int STILL_PERIOD_5                  = 0x05;
    public static final int STILL_PERIOD_6                  = 0x06;
    public static final int STILL_PERIOD_7                  = 0x07;
    public static final int STILL_PERIOD_8                  = 0x08;
    public static final int STILL_PERIOD_9                  = 0x09;
    public static final int STILL_PERIOD_10                 = 0x0A;
    public static final int STILL_PERIOD_15                 = 0x0F;
    public static final int STILL_PERIOD_20                 = 0x14;
    public static final int STILL_PERIOD_30                 = 0x1E;
    public static final int STILL_PERIOD_45                 = 0x2D;
    public static final int STILL_PERIOD_60                 = 0x3C;

    public static final String W_TIMELAPSE_PERIOD           = "W_TIMELAPSE_PERIOD";
    // Values
    public static final int TIMELAPSE_PERIOD_1              = 0x01;
    public static final int TIMELAPSE_PERIOD_2              = 0x02;
    public static final int TIMELAPSE_PERIOD_3              = 0x03;
    public static final int TIMELAPSE_PERIOD_4              = 0x04;
    public static final int TIMELAPSE_PERIOD_5              = 0x05;
    public static final int TIMELAPSE_PERIOD_6              = 0x06;
    public static final int TIMELAPSE_PERIOD_7              = 0x07;
    public static final int TIMELAPSE_PERIOD_8              = 0x08;
    public static final int TIMELAPSE_PERIOD_9              = 0x09;
    public static final int TIMELAPSE_PERIOD_10             = 0x0A;
    public static final int TIMELAPSE_PERIOD_15             = 0x0F;
    public static final int TIMELAPSE_PERIOD_20             = 0x14;
    public static final int TIMELAPSE_PERIOD_30             = 0x1E;
    public static final int TIMELAPSE_PERIOD_45             = 0x2D;
    public static final int TIMELAPSE_PERIOD_60             = 0x3C;

    public static final String W_PLAYBACK_FRAMERATE         = "W_PLAYBACK_FRAMERATE";
    // Values
    public static final int PLAYBACK_FRAMERATE_1            = 0x01;
    public static final int PLAYBACK_FRAMERATE_2            = 0x02;
    public static final int PLAYBACK_FRAMERATE_3            = 0x03;
    public static final int PLAYBACK_FRAMERATE_4            = 0x04;
    public static final int PLAYBACK_FRAMERATE_5            = 0x05;
    public static final int PLAYBACK_FRAMERATE_6            = 0x06;
    public static final int PLAYBACK_FRAMERATE_7            = 0x07;
    public static final int PLAYBACK_FRAMERATE_8            = 0x08;
    public static final int PLAYBACK_FRAMERATE_9            = 0x09;
    public static final int PLAYBACK_FRAMERATE_10           = 0x0A;
    public static final int PLAYBACK_FRAMERATE_15           = 0x0F;
    public static final int PLAYBACK_FRAMERATE_20           = 0x14;
    public static final int PLAYBACK_FRAMERATE_30           = 0x1E;
    public static final int PLAYBACK_FRAMERATE_45           = 0x2D;
    public static final int PLAYBACK_FRAMERATE_60           = 0x3C;

    /** COLOR PALETTES */

    public static final String W_IR_COLOR_LUT               = "W_IR_COLOR_LUT";
    // Values
    public static final String IR_COLOR_PALETTE_WHITE_HOT   = "WhiteHot";
    public static final String IR_COLOR_PALETTE_BLACK_HOT   = "BlackHot";
    public static final String IR_COLOR_PALETTE_GREEN_HOT   = "GreenHot";
    public static final String IR_COLOR_PALETTE_FUSION      = "Fusion";
    public static final String IR_COLOR_PALETTE_IRONBOW     = "Ironbow";
    public static final String IR_COLOR_PALETTE_LAVA        = "Lava";
    public static final String IR_COLOR_PALETTE_ARCTIC      = "Arctic";
    public static final String IR_COLOR_PALETTE_GREY_RED    = "GreyRed";
    public static final String IR_COLOR_PALETTE_INST_ALERT  = "InstAlert";

    /** ZOOM */

    public static final String W_IR_ZOOM                    = "W_IR_ZOOM";
    // Values
    public static final int IR_ZOOM_DEFAULT                 = 0x0064; // DEC: 100
    public static final int IR_ZOOM_2X                      = 0x00C8; // DEC: 200
    public static final int IR_ZOOM_4X                      = 0x0190; // DEC: 400

    /** SCENE */

    public static final String W_IR_SCENE                   = "W_IR_SCENE";
    // Values
    public static final String IR_SCENE_DEFAULT             = "Default";
    public static final String IR_SCENE_LINEAR              = "Linear";
    public static final String IR_SCENE_SEA_OR_SKY          = "SeaOrSky";
    public static final String IR_SCENE_OUTDOOR             = "Outdoor";
    public static final String IR_SCENE_CUSTOM1             = "Custom1";
    public static final String IR_SCENE_CUSTOM2             = "Custom2";

    public static final String W_IR_ROI                     = "W_IR_ROI";
    // Values
    public static final int IR_ROI_DISABLED                 = 0x00;
    public static final int IR_ROI_33                       = 0x21;
    public static final int IR_ROI_50                       = 0x32;
    public static final int IR_ROI_66                       = 0x42;
    public static final int IR_ROI_75                       = 0x4B;
    public static final int IR_ROI_100                      = 0x64;

    public static final String W_TAU_DDE                    = "W_TAU_DDE";
    // Values
    // Range    [-20, 100] (int)

    public static final String W_TAU_ACE                    = "W_TAU_ACE";
    // Values
    // Range    [-8, 8]    (int)

    public static final String W_TAU_SSO                    = "W_TAU_SSO";
    // Values
    // Range    [0, 100]   (int)


    /** FCC RECALIBRATION */

    public static final String W_IR_DO_FCC                  = "W_IR_DO_FCC";
    // Values
    public static final int IR_DO_FCC                       = 0x01;

    /** MAIN SETTINGS*/

    public static final String W_ANALOG_VIDEO_TYPE          = "W_ANALOG_VIDEO_TYPE";
    // Values
    public static final String ANALOG_VIDEO_TYPE_NTSC       = "NTSC";
    public static final String ANALOG_VIDEO_TYPE_PAL        = "PAL";

    public static final String W_IR_VIDEO_FILE_TYPE         = "W_IR_VIDEO_FILE_TYPE";
    // Values
    public static final String IR_VIDEO_FILE_TYPE_MJPEG     = "MJPEG";
    public static final String IR_VIDEO_FILE_TYPE_H264      = "H264";
    public static final String IR_VIDEO_FILE_TYPE_TIFF      = "TIFF";

    public static final String W_STILL_FILE_TYPE            = "W_STILL_FILE_TYPE";
    // Values
    public static final String IR_STILL_FILE_TYPE_MJPEG     = "FFF";
    public static final String IR_STILL_FILE_TYPE_H264      = "JPEG";
    public static final String IR_STILL_FILE_TYPE_TIFF      = "TIFF";

    public static final String W_FLIP_VERTICALLY            = "W_FLIP_VERTICALLY";
    // Values
    public static final int FLIP_VERTICALLY_0               = 0x00;
    public static final int FLIP_VERTICALLY_1               = 0x01;

    public static final String W_RECORD_STATE_TONE          = "W_RECORD_STATE_TONE";
    // Values
    public static final int RECORD_STATE_TONE_0             = 0x00;
    public static final int RECORD_STATE_TONE_1             = 0x01;

    public static final String W_SNAPSHOT_TONE              = "W_SNAPSHOT_TONE";
    // Values
    public static final int SNAPSHOT_TONE_0                 = 0x00;
    public static final int SNAPSHOT_TONE_1                 = 0x01;

    public static final String W_LED_ENABLED                = "W_LED_ENABLED";
    // Values
    public static final int LED_ENABLED_0                   = 0x00;
    public static final int LED_ENABLED_1                   = 0x01;

    /** ACCY. PORT SETTINGS*/

    public static final String W_SERIAL_PROTCOL             = "W_SERIAL_PROTCOL";
    // Values
    public static final String SERIAL_PROTOCOL_PWM          = "PWM";
    public static final String SERIAL_PROTOCOL_MAVLINK      = "MAVLINK";

    public static final String W_SERIAL_DATA_RATE           = "W_SERIAL_DATA_RATE";
    // Values
    public static final String SERIAL_DATA_RATE_57600       = "57600";
    public static final String SERIAL_DATA_RATE_115200      = "115200";
    public static final String SERIAL_DATA_RATE_230400      = "230400";

    public static final String W_PWM_1_FUNCTION             = "W_PWM_1_FUNCTION";
    public static final String W_PWM_2_FUNCTION             = "W_PWM_2_FUNCTION";
    public static final String W_PWM_3_FUNCTION             = "W_PWM_3_FUNCTION";
    public static final String W_PWM_4_FUNCTION             = "W_PWM_4_FUNCTION";
    // Values
    public static final String PWM_FUNCTION_DISABLED        = "DISABLED";
    public static final String PWM_FUNCTION_SYNC_SIGNAL     = "SYNC_SIGNAL";
    public static final String PWM_FUNCTION_IR_SCENE        = "IR_SCENE";
    public static final String PWM_FUNCTION_RECORD_STATUS   = "RECORD_STATUS";
    public static final String PWM_FUNCTION_IR_ZOOM         = "IR_ZOOM";
    public static final String PWM_FUNCTION_IR_ROI          = "IR_ROI";
    public static final String PWM_FUNCTION_DO_FCC          = "IR_DO_FCC";

    public static final String W_NUM_PWM_1_STATES           = "W_NUM_PWM_1_STATES";
    public static final String W_NUM_PWM_2_STATES           = "W_NUM_PWM_2_STATES";
    public static final String W_NUM_PWM_3_STATES           = "W_NUM_PWM_3_STATES";
    public static final String W_NUM_PWM_4_STATES           = "W_NUM_PWM_4_STATES";
    // Values
    public static final int NUM_PWM_STATES_2                = 0x02;
    public static final int NUM_PWM_STATES_3                = 0x03;

    public static final String W_PWM_LUT_STATE_1            = "W_PWM_LUT_STATE_1";
    public static final String W_PWM_LUT_STATE_2            = "W_PWM_LUT_STATE_2";
    public static final String W_PWM_LUT_STATE_3            = "W_PWM_LUT_STATE_3";
    // Values
    // See COLOR PALETTES values.

    public static final String W_PWM_SCENE_STATE_1          = "W_PWM_SCENE_STATE_1";
    public static final String W_PWM_SCENE_STATE_2          = "W_PWM_SCENE_STATE_2";
    public static final String W_PWM_SCENE_STATE_3          = "W_PWM_SCENE_STATE_3";
    // Values
    // See SCENE values.

    public static final String W_PWM_ROI_STATE_1            = "W_PWM_ROI_STATE_1";
    public static final String W_PWM_ROI_STATE_2            = "W_PWM_ROI_STATE_2";
    public static final String W_PWM_ROI_STATE_3            = "W_PWM_ROI_STATE_3";
    // Values
    // See SCENE ROI values.

    /** RAD. SETTINGS*/

    public static final String W_TEMPERATURE_UNIT           = "W_TEMPERATURE_UNIT";
    // Values
    public static final String TEMPERATURE_UNIT_C           = "C";
    public static final String TEMPERATURE_UNIT_F           = "F";

    public static final String W_IR_GAIN                    = "W_IR_GAIN";
    // Values
    public static final int IR_GAIN_0                       = 0x00;
    public static final int IR_GAIN_1                       = 0x01;
    public static final int IR_GAIN_2                       = 0x02;

    public static final String W_SPOT_METER                 = "W_SPOT_METER";
    // Values
    public static final int SPOT_METER_0                    = 0x00;
    public static final int SPOT_METER_1                    = 0x01;

    public static final String W_SCENE_METER                = "W_SCENE_METER";
    // Values
    public static final int SCENE_METER_0                   = 0x00;
    public static final int SCENE_METER_1                   = 0x01;

    public static final String W_RAD_OT_STL                 = "W_RAD_OT_STL";
    // Values
    public static final int RAD_OT_STL_0                    = 0x00;
    public static final int RAD_OT_STL_1                    = 0x01;


    public static final String W_RAD_OT_STL_THRESH          = "W_RAD_OT_STL_THRESH";
    // Values
    // Range [0, 300] (int), increments of 10.

    public static final String W_RAD_OT_ALT                 = "W_RAD_OT_ALT";
    // Values
    public static final int RAD_OT_ALT_0                    = 0x00;
    public static final int RAD_OT_ALT_1                    = 0x01;

    public static final String W_RAD_OT_ALT_THRESH          = "W_RAD_OT_ALT_THRESH";
    // Values
    // Range [0, 300] (int), increments of 10.

    public static final String W_RAD_EMISSIVITY             = "W_RAD_EMISSIVITY";
    // Values
    // Range [0, 100] (int)

    public static final String W_RAD_SKY_COND               = "W_RAD_SKY_COND";
    // Values
    public static final int RAD_SKY_COND_CLOUDY             = 0x4B;
    public static final int RAD_SKY_COND_SCATTERED          = 0x19;
    public static final int RAD_SKY_COND_CLEAR              = 0x00;

    public static final String W_RAD_AIR_TEMP               = "W_RAD_AIR_TEMP";
    // Values
    // Range [0, 40] (int), increments of 5.

    public static final String W_RAD_HUMIDITY               = "W_RAD_HUMIDITY";
    // Values
    public static final int RAD_HUMIDITY_LOW                = 0x1E;
    public static final int RAD_HUMIDITY_MEDIUM             = 0x2D;
    public static final int RAD_HUMIDITY_HIGH               = 0x3C;

    public static final String W_TARGET_RANGE               = "W_TARGET_RANGE";
    // Values
    // Range [0, 200] (int), increments of 10.

    /** OTHER */

    public static final String W_BT_TX_POWER                = "W_BT_TX_POWER";
    // Values
    // Range [1, 100] (int)

    public static final String W_FACTORY_RESET              = "W_FACTORY_RESET";
    // Values
    public static final int FACTORY_RESET                   = 0x01;

    public static final String W_DATETIME                   = "W_DATETIME";
    // Values
    // Format:
    // 17092711523388+0200

    public static String toHexString(String command) {
         char[] chars = command.toCharArray();

         StringBuilder stringBuilder = new StringBuilder();

         for(char c : chars) {
             int i = (int) c;
             stringBuilder.append(Integer.toHexString(i).toUpperCase());
         }

         return stringBuilder.toString();
     }

    private Commands() {
        throw new AssertionError();
    }
}
