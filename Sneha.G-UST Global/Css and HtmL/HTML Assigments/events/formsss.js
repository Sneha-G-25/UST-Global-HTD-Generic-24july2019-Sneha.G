<form action="">
            <div>
                    <label for="name" style="font:20px;">Full Name*</label> &nbsp &nbsp
                    <input type="text" name="a" id="a" placeholder="First Name" required>
                    <input type="text" name="b" id="b" placeholder="Middle Name" required>
                    <input type="text" name="i" id="i" placeholder="Last Name" required>
            </div>
            <div>
                    <br><label for="address">Address*</label> &nbsp; &nbsp;
                    <input type="text" name="c" id="c" placeholder="Street Address" required><br><br>
                    <input type="text" name="d" id="d" placeholder="Street Address Line2" required><br><br>
                    <input type="text" name="e" id="e" placeholder="City" required>
                    <input type="text" name="f" id="f" placeholder="State/Province" required><br><br>
                    <input type="text" name="g" id="g" placeholder="Postal/Zip Code" required>
                    <input type="text" name="h" id="h" placeholder="Country" required><br>
            </div>    
            <div>
                <br><label for="email">Email Address*</label> &nbsp;&nbsp;
                <input type="email" name="j" id="j" placeholder="ex:myname@example.com">
            </div>
            <div>
                <br><label for="phnum">Phone Number*</label>&nbsp;&nbsp;
                <input type="number" name="k" id="k" placeholder="area code"> &nbsp;&nbsp;
                <input type="tel" name="l" id="l" placeholder="Phone Number">
            </div>
            <div>
                <br><label for="bdate">Birth Date*</label> &nbsp; &nbsp;
                <select name="month" id="month">
                        <option value="0" selected disabled>Month</option>
                        <option value="Jan">January</option>
                        <option value="Feb">Febrauary,</option>
                        <option value="Mar">March</option>
                        <option value="Apr">April</option>
                        <option value="May">May</option>
                        <option value="Jun">June</option>
                        <option value="Jul">July</option>
                        <option value="Aug">August</option>
                        <option value="Sept">September</option>
                        <option value="Oct">October</option>
                        <option value="Nov">November</option>
                        <option value="Dec">December</option>
                </select>
                <select name="day" id="day">
                <option value="0" selected disabled>Day</option>
                <option value="mon">Monday</option>
                <option value="tue">Tuesday</option>
                <option value="wed">Wednesday</option>
                <option value="thu">Thursday</option>
                <option value="fri">Friday</option>
                <option value="sat">Saturday</option>
                <option value="sun">Sunday</option>
                </select>
            </div>
        </form>