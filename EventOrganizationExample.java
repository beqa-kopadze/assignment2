import organizations.events.Event;
import organizations.events.EventPlanningCompany;
import organizations.party.Election;
import organizations.party.Party;

import java.time.LocalDate;
import java.util.List;

public class EventOrganizationExample {
    public static void main(String[] args) {
        // Create events
        Event event1 = new Event("Conference", "Annual tech conference", LocalDate.of(2023, 6, 15), "Convention Center");
        Event event2 = new Event("Wedding", "Jane and John's wedding", LocalDate.of(2023, 8, 20), "Garden Venue");
        Event event3 = new Event("Concert", "Rock music festival", LocalDate.of(2023, 7, 1), "Stadium");
        Event event4 = new Event("Corporate Event", "Company annual party", LocalDate.of(2023, 12, 15), "Hotel Ballroom");

        // Create event planning companies
        EventPlanningCompany company1 = new EventPlanningCompany("ABC Events", "Professional event planning services");
        company1.setEmail("info@abcevents.com");
        company1.setPhoneNumber("555-1234");
        company1.setAddress("123 Main Street, City");

        EventPlanningCompany company2 = new EventPlanningCompany("XYZ Planners", "Exceptional event experiences");
        company2.setEmail("contact@xyzplanners.com");
        company2.setPhoneNumber("555-5678");
        company2.setAddress("456 Oak Avenue, City");

        // Add events to companies
        company1.addEvent(event1);
        company1.addEvent(event2);
        company2.addEvent(event3);
        company2.addEvent(event4);

        // Create elections
        Election election1 = new Election(1000000, true, "Presidential election");
        Election election2 = new Election(500000, false, "Gubernatorial election");
        Election election3 = new Election(200000, true, "Local council election");

        // Create parties
        Party party1 = new Party("Democratic Party", "Building a better future for all");
        party1.setEmail("info@democrats.org");
        party1.setPhoneNumber("555-2345");
        party1.setAddress("456 Elm Street, City");

        Party party2 = new Party("Republican Party", "Upholding traditional values");
        party2.setEmail("contact@republicans.org");
        party2.setPhoneNumber("555-6789");
        party2.setAddress("789 Pine Road, City");

        // Add elections to parties
        party1.addElection(election1);
        party1.addElection(election2);
        party2.addElection(election3);

        // Print event planning companies and their events
        System.out.println("Event Planning Companies:");
        printEventPlanningCompany(company1);
        printEventPlanningCompany(company2);

        // Print parties and their elections
        System.out.println("\nParties:");
        printParty(party1);
        printParty(party2);
    }

    private static void printEventPlanningCompany(EventPlanningCompany company) {
        System.out.println("Company Name: " + company.getName());
        System.out.println("Description: " + company.getDescription());
        System.out.println("Email: " + company.getEmail());
        System.out.println("Phone: " + company.getPhoneNumber());
        System.out.println("Address: " + company.getAddress());
        System.out.println("Events:");
        for (Event event : company.getEvents()) {
            System.out.println("- " + event.getName() + " (" + event.getDate() + ", " + event.getLocation() + ")");
        }
        System.out.println();
    }

    private static void printParty(Party party) {
        System.out.println("Party Name: " + party.getName());
        System.out.println("Mission: " + party.getMission());
        System.out.println("Email: " + party.getEmail());
        System.out.println("Phone: " + party.getPhoneNumber());
        System.out.println("Address: " + party.getAddress());
        System.out.println("Elections:");
        List<Election> fairElections = party.getFairElections();
        for (Election election : fairElections) {
            System.out.println("- " + election.getDescription() + " (Voters: " + election.getVotersNumber() + ")");
        }
        System.out.println();
    }
}