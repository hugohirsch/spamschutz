/**
 SpamSchutz - simple way to protect your mail adresses from naiive spammers
 Copyright (C) 2011, Aiki IT

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.aikiit.spamprotector;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author hirsch
 * @version 2011-12-28, 13:26
 */
@org.junit.Ignore("Not working on Travis, because VNC/X is not allowed on docker agents.")
public class AntiSpamApplicationTest {
    @Test
    public final void instantiationDone() {
        AntiSpamApplication.initApplication();
        AntiSpamApplication.main(null);
        assertNotNull("This is just to please the compiler.");
    }
}
