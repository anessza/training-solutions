package exam03;
/*
Utazási iroda hajóutakat szervez. Minden hajóút egy adott hajóval történik,
amelynek neve és befogadóképessége az egy Boat osztályban van tárolva.

Az utasok adott hajóra, adott osztályra foglalnak helyet. A helyfoglaláskor
azonban ellenőrizni kell, hogy a befogadóképesség alapján van-e még hely.
Ha nincs, egy kivételt várunk a megfelelő szöveggel. A CruiseClass enum
tárolja a különböző osztályokat. LUXURY, FIRST és SECOND osztályok vannak.
Az ár számolása úgy történik, hogy venni kell a hajóhoz tartozó alapárat,
és meg kell szorozni az osztályhoz tartozó szorzóval, rendre 3,0, 1,8 és 1,0.

UML

    bookPassenger(): egy foglalás. Ellenőrizni kell, hogy van-e még elég hely.
    getPriceForPassenger(): visszaadja, hogy mennyibe kerülne a foglalás. Ez a metódus még NEM foglal.
    findPassengerByName(): foglalás megkeresése név alapján
    getPassengerNamesOrdered(): visszaadja a foglalást végzők neveit ábécé sorrendben
    sumAllBookingsCharged(): összegzi, hogy mennyi az összes bevétel
    countPassengerByClass(): visszaadja, hogy osztályonként mennyien foglaltak

 */

public class Boat {

    private String name;
    private int maxPassengers;

    public Boat(String name, int maxPassengers) {
        this.name = name;
        this.maxPassengers = maxPassengers;
    }

    public String getName() {
        return name;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}
