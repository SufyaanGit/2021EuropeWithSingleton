import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BTWCheckTest {

    BTWCheck europe;

    @BeforeEach
    void init () {
        europe = BTWCheck.getInstance();
    }

    @Test
    void testBTWPercentages () {
        assertFalse (europe.isReverseChargeApplicable("CA"));
        assertTrue (europe.isReverseChargeApplicable("BE"));
    }
}