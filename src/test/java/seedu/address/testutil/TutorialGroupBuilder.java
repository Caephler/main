package seedu.address.testutil;

import seedu.address.model.assignment.Assignment;
import seedu.address.model.assignment.AssignmentList;
import seedu.address.model.student.Student;
import seedu.address.model.student.UniqueStudentList;
import seedu.address.model.tutorialgroup.TutorialGroup;

/**
 * A utility class to help with building TutorialGroup objects.
 */
public class TutorialGroupBuilder {
    public static final String DEFAULT_NAME = "CS1101S Studio 04A";
    public static final String DEFAULT_ID = "04a";

    private String name;
    private String id;
    private UniqueStudentList students;
    private AssignmentList assignments;

    public TutorialGroupBuilder() {
        name = DEFAULT_NAME;
        id = DEFAULT_ID;
        students = new UniqueStudentList();
        assignments = new AssignmentList();
    }

    /**
     * Initializes the TutorialGroupBuilder with the data of {@code source}.
     * @param source The source TutorialGroup.
     */
    public TutorialGroupBuilder(TutorialGroup source) {
        name = source.getName();
        id = source.getId();
        students = source.getStudents().clone();
        assignments = source.getAssignments().clone();
    }

    /**
     * Sets the name of the {@code TutorialGroup} we are building.
     */
    public TutorialGroupBuilder withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Sets the ID of the {@code TutorialGroup} we are building.
     */
    public TutorialGroupBuilder withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Adds a {@code Student} to this {@code TutorialGroup} we are building.
     */
    public TutorialGroupBuilder addStudent(Student student) {
        students.add(student);
        return this;
    }

    /**
     * Removes a {@code Student} from this {@code TutorialGroup} we are building.
     */
    public TutorialGroupBuilder removeStudent(Student student) {
        students.remove(student);
        return this;
    }

    /**
     * Adds an {@code Assignment} from this {@code TutorialGroup} we are building.
     */
    public TutorialGroupBuilder addAssignment(Assignment assignment) {
        assignments.add(assignment);
        return this;
    }

    /**
     * Removes an {@code Assignment} from this {@code TutorialGroup} we are building.
     */
    public TutorialGroupBuilder removeAssignment(Assignment assignment) {
        assignments.remove(assignment);
        return this;
    }

    public TutorialGroup build() {
        return new TutorialGroup(id, name, students, assignments);
    }
}
