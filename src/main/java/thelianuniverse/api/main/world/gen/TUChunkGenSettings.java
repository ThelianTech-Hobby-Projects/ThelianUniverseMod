package thelianuniverse.api.main.world.gen;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;

import net.minecraft.util.JsonUtils;

import thelianuniverse.api.main.Util.Logger;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;

@SuppressWarnings("WeakerAccess")
public class TUChunkGenSettings {

    public final int seaLevel;          //Vanilla

    public final boolean useMineShaftFeature;          //Vanilla

    public final boolean useMonumentFeature;          //Vanilla

    public final boolean useStrongholdFeature;          //Vanilla

    public final boolean useTempleFeature;          //Vanilla

    public final boolean useVillageFeature;          //Vanilla

    private TUChunkGenSettings(TUChunkGenSettings.Factory initFactorySettings) {

        this.seaLevel = initFactorySettings.seaLevel;

        this.useMineShaftFeature = initFactorySettings.useMineShaftFeature;

        this.useMonumentFeature = initFactorySettings.useMonumentFeature;

        this.useStrongholdFeature = initFactorySettings.useStrongholdFeature;

        this.useTempleFeature = initFactorySettings.useTempleFeature;

        this.useVillageFeature = initFactorySettings.useVillageFeature;



    }

    public static class Factory {

        static final Gson JSON_ADAPTER = (new GsonBuilder()).registerTypeAdapter(TUChunkGenSettings.Factory.class, new TUChunkGenSettings.Serializer()).create();


        public int seaLevel = 79;


        public boolean useMineShaftFeature = false;

        public boolean useMonumentFeature = false;

        public boolean useStrongholdFeature = false;

        public boolean useTempleFeature = false;

        public boolean useVillageFeature = false;

        public Factory() {

            this.setDefaults();

        }

        public static TUChunkGenSettings.Factory jsonToFactory(String genSettings) {

            if (genSettings.isEmpty()) {

                return new TUChunkGenSettings.Factory();
            }
            try {

                JsonReader reader = new JsonReader(new StringReader(genSettings));
                reader.setLenient(true);
                return JSON_ADAPTER.getAdapter(Factory.class).read(reader);
            }
            catch (IOException ex) {

                Logger.error("Error parsing Chunk Generator Settings: {}", ex.getMessage());
                Logger.error("Settings: {}", genSettings);
                return new TUChunkGenSettings.Factory();
            }
        }

        public String toString() {

            return JSON_ADAPTER.toJson(this);
        }

        public final void setDefaults() {

            this.seaLevel = 79;
        }

        public TUChunkGenSettings build() {

            return new TUChunkGenSettings(this);
        }
    }

    public static class Serializer implements JsonDeserializer<Factory>, JsonSerializer<Factory> {

        /**
         * @param element .
         * @param type    .
         * @param context .
         * @return .
         * @throws JsonParseException .
         */
        @Override
        public Factory deserialize(JsonElement element, Type type, JsonDeserializationContext context) {

            JsonObject json = element.getAsJsonObject();
            Factory settings = new Factory();

            try {

                settings.seaLevel = JsonUtils.getInt(json,"seaLevel", settings.seaLevel);



            }

            catch (Exception ignore) {

            }

            return settings;
        }


        @Override
        public JsonElement serialize(TUChunkGenSettings.Factory factory, Type type, JsonSerializationContext context) {

            JsonObject json = new JsonObject();

            json.addProperty("seaLevel", factory.seaLevel);


            return json;
        }




    }
}
