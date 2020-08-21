package sample;

public class JobFloor {

    //a list of all the food floors

    int employeeNum; //the number of employees that are currently employed
    Trait trait; //the category the floor falls under
    FloorName floorName; //the name of the floor

    //the 5 skills in the game
    public enum Trait
    {
        FOOD,
        RETAIL,
        RECREATION,
        CREATIVE,
        SERVICE,
        NULL
    }

    public static enum FloorName
    {
        //Foods floors
        AIRLINE_FOOD,
        ASIAN_CUISINE,
        BAKERY,
        BBQ_PLACE,
        BURRITO_BAR,
        CHEESE_SHOP,
        COFFEE_HOUSE,
        COOKIE_SHOP,
        DINER,
        DOGGY_DAYCARE,
        DONUT_SHOP,
        FANCY_CUISINE,
        FROZEN_YOGURT,
        HOT_DOG_JOINT,
        ITIALIAN_FOOD,
        LOTUS_HOUSE,
        MEXICAN_FOOD,
        MOROCCAN_CUISINE,
        PANCAKE_HOUSE,
        PIZZA_PLACE,
        PUB,
        ROCK_DINER,
        SCOOPS,
        SEAFOOD,
        SHRIMP_BUFFET,
        SKY_BURGER,
        SMOOTHIE_SHOP,
        SUB_SHOP,
        SUSHI_BAR,
        TEA_HOUSE,
        VEGAN_FOOD,
        WARREN_BUFFET,

        //Retail Floors
        AUTO_DEALER,
        BIKE_SHOP,
        BLING_JEWELERS,
        BOOK_STORE,
        BRICK_STORE,
        CANDLE_SHOP,
        CANDY_SHOPPE,
        COMIC_STORE,
        FABRIC_SHOP,
        FURNITURE_SHOP,
        GAME_STORE,
        GROCERY_STORE,
        HAT_SHOP,
        HOME_SUPPLY,
        JEWELERY_STORE,
        JOEY_BITTON,
        LEGIT_WATCHES,
        MAPPLE_STORE,
        MENS_FASHION,
        MUSIC_STORE,
        PET_SHOP,
        PLANT_NURSERY,
        RECORD_SHOP,
        ROBOT_STORE,
        SHOE_STORE,
        SURF_SHOP,
        TECH_STORE,
        TOURIST_TRAP,
        WOMENS_FASHION,

        //Recreation floors
        AQUARIUM,
        ARCADE,
        ARCHERY_RANGE,
        BILLIARD_HALL,
        BOWLING_ALLEY,
        BOXING_GYM,
        BROADWAY_THEATRE,
        CASINO,
        CINEPLEX,
        CIRCUS,
        COMEDY_CLUB,
        CYBER_CAFE,
        GOLF_SIM,
        HAUNTED_HOUSE,
        INDOOR_SKYDIVING,
        KARAOKE_CLUB,
        MINI_GOLF,
        MUSEUM,
        NIGHT_CLUB,
        PAINTBALL_ARENA,
        PARK,
        PLANETARIUM,
        RACQUETBALL,
        ROCK_CLIMBING,
        SPLASH_ZONE,
        THEATER,
        TIGER_MAGIC,
        VIDEO_RENTAL,
        VOLLEYBALL_CLUB,
        WAX_MUSEUM,

        //Creative floors

        AD_AGENCY,
        ANIMATION_STUDIO,
        ARCHTECT_OFFICE,
        ART_STUDIO,
        CAKE_STUDIO,
        CHOCOLATIER,
        CLOCKMAKER,
        COSTUME_SHOP,
        CREATIVE_INK,
        DANCE_STUDIO,
        FASHION_STUDIO,
        FILM_STUDIO,
        FLORAL_STUDIO,
        GAME_STUDIO,
        GLASS_STUDIO,
        GRAPHIC_DESIGN,
        MAKERSPACE,
        LABORATORY,
        METAL_STUDIO,
        MODEL_TRAINS,
        NATIVE_ART_STUDIO,
        PHOTO_STUDIO,
        POTTERY_STUDIO,
        RECORDING_STUDIO,
        SCULPTING_STUDIO,
        SODA_BREWERY,
        SOFTWARE_STUDIO,
        SUPERHERO_LAB,
        TATTO_PARLOR,
        TV_STUDIO,
        WOOD_SHOP,


        //SERVICE
        BANK,
        BARBER_SHOP,
        BITBOOK,
        COLLEGE,
        COURTHOUSE,
        DAY_SPA,
        DENTISTS_OFFICE,
        DEVICE_REPAIR,
        DOCTORS_OFFICE,
        FIRE_STATION,
        FORTUNE_TELLER,
        HEALTH_CLUB,
        LAUNDROMAT,
        LAW_OFFICES,
        MARTIAL_ARTS,
        MECHANIC,
        OPTOMETRIST,
        PHARMACY,
        PLUMBER,
        PRIVATE_EYE,
        RECYCLING,
        SECURITY_OFFICE,
        SHIP_AND_PRINT,
        STABLES,
        STOCK_EXCHANGE,
        STYLE_SALON,
        TAILOR,
        TRAVEL_AGENCY,
        TUTORING_CENTER,
        WEDDING_CHAPEL,
        UNEMPLOYED
        }

    public void setTrait(FloorName floor)
    {
        //assigning the trait based on the name of the floor
        switch (floor)
        {
            case AIRLINE_FOOD:
            case ASIAN_CUISINE:
            case BAKERY:
            case BBQ_PLACE:
            case BURRITO_BAR:
            case CHEESE_SHOP:
            case COFFEE_HOUSE:
            case COOKIE_SHOP:
            case DINER:
            case DONUT_SHOP:
            case FANCY_CUISINE:
            case FROZEN_YOGURT:
            case HOT_DOG_JOINT:
            case ITIALIAN_FOOD:
            case LOTUS_HOUSE:
            case MEXICAN_FOOD:
            case MOROCCAN_CUISINE:
            case PANCAKE_HOUSE:
            case PIZZA_PLACE:
            case PUB:
            case ROCK_DINER:
            case SCOOPS:
            case SEAFOOD:
            case SHRIMP_BUFFET:
            case SKY_BURGER:
            case SMOOTHIE_SHOP:
            case SUB_SHOP:
            case SUSHI_BAR:
            case TEA_HOUSE:
            case VEGAN_FOOD:
            case WARREN_BUFFET:
                trait = Trait.FOOD;
                break;

            case AUTO_DEALER:
            case BIKE_SHOP:
            case BLING_JEWELERS:
            case BOOK_STORE:
            case BRICK_STORE:
            case CANDLE_SHOP:
            case CANDY_SHOPPE:
            case COMIC_STORE:
            case FABRIC_SHOP:
            case FURNITURE_SHOP:
            case GAME_STORE:
            case GROCERY_STORE:
            case HAT_SHOP:
            case HOME_SUPPLY:
            case JEWELERY_STORE:
            case JOEY_BITTON:
            case LEGIT_WATCHES:
            case MAPPLE_STORE:
            case MENS_FASHION:
            case MUSIC_STORE:
            case PET_SHOP:
            case PLANT_NURSERY:
            case RECORD_SHOP:
            case ROBOT_STORE:
            case SHOE_STORE:
            case SURF_SHOP:
            case TECH_STORE:
            case TOURIST_TRAP:
            case WOMENS_FASHION:
                trait = Trait.RETAIL;
                break;

            case AQUARIUM:
            case ARCADE:
            case ARCHERY_RANGE:
            case BILLIARD_HALL:
            case BOWLING_ALLEY:
            case BOXING_GYM:
            case BROADWAY_THEATRE:
            case CASINO:
            case CINEPLEX:
            case CIRCUS:
            case COMEDY_CLUB:
            case CYBER_CAFE:
            case GOLF_SIM:
            case HAUNTED_HOUSE:
            case INDOOR_SKYDIVING:
            case KARAOKE_CLUB:
            case MINI_GOLF:
            case MUSEUM:
            case NIGHT_CLUB:
            case PAINTBALL_ARENA:
            case PARK:
            case PLANETARIUM:
            case RACQUETBALL:
            case ROCK_CLIMBING:
            case SPLASH_ZONE:
            case THEATER:
            case TIGER_MAGIC:
            case VIDEO_RENTAL:
            case VOLLEYBALL_CLUB:
            case WAX_MUSEUM:
                trait = Trait.RECREATION;
                break;

            case AD_AGENCY:
            case ANIMATION_STUDIO:
            case  ARCHTECT_OFFICE:
            case ART_STUDIO:
            case CAKE_STUDIO:
            case CHOCOLATIER:
            case CLOCKMAKER:
            case COSTUME_SHOP:
            case CREATIVE_INK:
            case DANCE_STUDIO:
            case FASHION_STUDIO:
            case FILM_STUDIO:
            case FLORAL_STUDIO:
            case GAME_STUDIO:
            case GLASS_STUDIO:
            case GRAPHIC_DESIGN:
            case LABORATORY:
            case MAKERSPACE:
            case METAL_STUDIO:
            case MODEL_TRAINS:
            case NATIVE_ART_STUDIO:
            case PHOTO_STUDIO:
            case POTTERY_STUDIO:
            case RECORDING_STUDIO:
            case SCULPTING_STUDIO:
            case SODA_BREWERY:
            case SOFTWARE_STUDIO:
            case SUPERHERO_LAB:
            case TATTO_PARLOR:
            case TV_STUDIO:
            case WOOD_SHOP:
                trait = Trait.CREATIVE;
                break;

            case BANK:
            case BARBER_SHOP:
            case BITBOOK:
            case COLLEGE:
            case COURTHOUSE:
            case DAY_SPA:
            case DENTISTS_OFFICE:
            case DEVICE_REPAIR:
            case DOCTORS_OFFICE:
            case DOGGY_DAYCARE:
            case FIRE_STATION:
            case FORTUNE_TELLER:
            case HEALTH_CLUB:
            case LAUNDROMAT:
            case LAW_OFFICES:
            case MARTIAL_ARTS:
            case MECHANIC:
            case OPTOMETRIST:
            case PHARMACY:
            case PLUMBER:
            case PRIVATE_EYE:
            case RECYCLING:
            case SECURITY_OFFICE:
            case SHIP_AND_PRINT:
            case STABLES:
            case STOCK_EXCHANGE:
            case STYLE_SALON:
            case TAILOR:
            case TRAVEL_AGENCY:
            case TUTORING_CENTER:
            case WEDDING_CHAPEL:
                trait = Trait.SERVICE;
                break;

        //other
            case UNEMPLOYED:
                trait = Trait.NULL;
        }
    }

    public JobFloor(FloorName name)
    {
        floorName = name;

        setTrait(floorName);


        employeeNum = 0;
    }

}
