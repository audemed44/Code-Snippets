class SpaceAge {

    double age;

    SpaceAge(double seconds) {

        this.age = seconds;
        
    }

    double getSeconds() {
        return age;
    }

    double onEarth() {
        return age/31557600;
    }

    double onMercury() {
        return age/(0.2408467*31557600);
    }

    double onVenus() {
        return age/(0.61519726*31557600);
    }

    double onMars() {
        return age/(1.8808158*31557600);
    }

    double onJupiter() {
        return age/(11.862615*31557600);
    }

    double onSaturn() {
        return age/(29.447498*31557600);
    }

    double onUranus() {
        return age/(84.016846*31557600);
    }

    double onNeptune() {
        return age/(164.79132*31557600);
    }

}
